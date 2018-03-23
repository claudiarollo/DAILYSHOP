package it.unisalento.pps.view.ActionListener;

import it.unisalento.pps.business.LoginBusiness;
import it.unisalento.pps.view.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {

    private Frame frame;

    public final static String LOGIN = "effettua il login";
    public final static String INDIETRO_DA_LOGIN = "Vai indietro alla home";


    public LoginListener(Frame frame) {
        this.frame = frame;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if(sorgenteEvento.equals(LOGIN)) {

            try {
                LoginBusiness login = new LoginBusiness();
                String user = frame.getLoginPanel().getUsernameTxt().getText();
                String pwd = new String(frame.getLoginPanel().getPasswordTxt().getPassword());

                if (user.isEmpty() || pwd.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Inserisci le tue credenziali per accedere");
                }
                else {
                    if (login.effettuaLogin(user, pwd) != null) {
                        String ruolo = login.effettuaLogin(user, pwd).getRuolo();
                        if (ruolo.equals("registrato")) {
                            JOptionPane.showMessageDialog(null, "Login effettuato con successo");
                            frame.getLoginPanel().getLoginPanel().setVisible(false);
                            frame.getLoginPanel().getUsernameTxt().setText(null);
                            frame.getLoginPanel().getPasswordTxt().setText(null);
                        }
                        else if (ruolo.equals("amministratore")) {
                            JOptionPane.showMessageDialog(null, "Amministratore loggato con successo");
                            frame.getLoginPanel().getLoginPanel().setVisible(false);
                            frame.getAmministratorePanel().getAmministratorePanel().setVisible(true);
                            frame.getLoginPanel().getUsernameTxt().setText(null);
                            frame.getLoginPanel().getPasswordTxt().setText(null);
                        }
                        else if (ruolo.equals("gestore")) {
                            JOptionPane.showMessageDialog(null, "Gestore loggato con successo");
                            frame.getLoginPanel().getLoginPanel().setVisible(false);
                            frame.getLoginPanel().getUsernameTxt().setText(null);
                            frame.getLoginPanel().getPasswordTxt().setText(null);
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Il login non è andato a buon fine...");
                        frame.getLoginPanel().getUsernameTxt().setText(null);
                        frame.getLoginPanel().getPasswordTxt().setText(null);
                        }
                }
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "I caratteri inseriti non sono validi");
                frame.getLoginPanel().getUsernameTxt().setText(null);
                frame.getLoginPanel().getPasswordTxt().setText(null);
            }
        }


        if(sorgenteEvento.equals(INDIETRO_DA_LOGIN)){
            frame.getLoginPanel().getLoginPanel().setVisible(false);
            frame.getHomePanel().getHomePanel().setVisible(true);
            frame.getLoginPanel().getUsernameTxt().setText(null);
            frame.getLoginPanel().getPasswordTxt().setText(null);
        }

    }
}
