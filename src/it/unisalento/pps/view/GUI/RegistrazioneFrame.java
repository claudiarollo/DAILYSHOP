package it.unisalento.pps.view.GUI;

import it.unisalento.pps.business.UtenteBusiness;
import it.unisalento.pps.business.UtenteRegistratoBusiness;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrazioneFrame {
    private JPanel mainPnl;
    private JPanel northPnl;
    private JPanel centerPnl;
    private JPanel southPnl;
    private JLabel registrazioneLbl;
    private JLabel nomeLbl;
    private JLabel cognomeLbl;
    private JLabel usernameLbl;
    private JLabel emailLbl;
    private JLabel passwordLbl;
    private JPasswordField passwordTxt;
    private JTextField emailTxt;
    private JTextField usernameTxt;
    private JTextField cognomeTxt;
    private JTextField nomeTxt;
    private JButton confermaBtn;
    private JButton indietroBtn;



    public RegistrazioneFrame() {
        confermaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = getNomeTxt().getText();
                String cognome = getCognomeTxt().getText();
                String username = getUsernameTxt().getText();
                String email = getEmailTxt().getText();
                String password = new String(getPasswordTxt().getPassword());

                if(nome.isEmpty() || cognome.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Per registrarsi è necessario inserire tutti i campi");
                }
                else {
                    UtenteBusiness ub = new UtenteBusiness();
                    boolean ris = ub.controllaUsername(username);
                    boolean result = ub.controllaEmail(email);

                    if(ris == false && result == false) {
                        UtenteRegistratoBusiness ut = new UtenteRegistratoBusiness();
                        ut.effettuaRegistrazione(nome, cognome, username, email, password);
                        JOptionPane.showMessageDialog(null, "Richiesta di registrazione avvenuta con successo");
                    }
                    else {
                        if (ris == true)
                            JOptionPane.showMessageDialog(null, "Il tuo username è già stato scelto da qualcuno. " +
                                    "Per favore scegli un altro username");
                        else if (result == true)
                            JOptionPane.showMessageDialog(null, "L'email inserita è già stata utilizzata");
                    }
                }
            }
        });
    }


    public JPanel getMainPnl() {
        return mainPnl;
    }

    public void setMainPnl(JPanel mainPnl) {
        this.mainPnl = mainPnl;
    }

    public JPanel getNorthPnl() {
        return northPnl;
    }

    public void setNorthPnl(JPanel northPnl) {
        this.northPnl = northPnl;
    }

    public JPanel getCenterPnl() {
        return centerPnl;
    }

    public void setCenterPnl(JPanel centerPnl) {
        this.centerPnl = centerPnl;
    }

    public JPanel getSouthPnl() {
        return southPnl;
    }

    public void setSouthPnl(JPanel southPnl) {
        this.southPnl = southPnl;
    }

    public JLabel getRegistrazioneLbl() {
        return registrazioneLbl;
    }

    public void setRegistrazioneLbl(JLabel registrazioneLbl) {
        this.registrazioneLbl = registrazioneLbl;
    }

    public JLabel getNomeLbl() {
        return nomeLbl;
    }

    public void setNomeLbl(JLabel nomeLbl) {
        this.nomeLbl = nomeLbl;
    }

    public JLabel getCognomeLbl() {
        return cognomeLbl;
    }

    public void setCognomeLbl(JLabel cognomeLbl) {
        this.cognomeLbl = cognomeLbl;
    }

    public JLabel getUsernameLbl() {
        return usernameLbl;
    }

    public void setUsernameLbl(JLabel usernameLbl) {
        this.usernameLbl = usernameLbl;
    }

    public JLabel getEmailLbl() {
        return emailLbl;
    }

    public void setEmailLbl(JLabel emailLbl) {
        this.emailLbl = emailLbl;
    }

    public JLabel getPasswordLbl() {
        return passwordLbl;
    }

    public void setPasswordLbl(JLabel passwordLbl) {
        this.passwordLbl = passwordLbl;
    }

    public JPasswordField getPasswordTxt() {
        return passwordTxt;
    }

    public void setPasswordTxt(JPasswordField passwordTxt) {
        this.passwordTxt = passwordTxt;
    }

    public JTextField getEmailTxt() {
        return emailTxt;
    }

    public void setEmailTxt(JTextField emailTxt) {
        this.emailTxt = emailTxt;
    }

    public JTextField getUsernameTxt() {
        return usernameTxt;
    }

    public void setUsernameTxt(JTextField usernameTxt) {
        this.usernameTxt = usernameTxt;
    }

    public JTextField getCognomeTxt() {
        return cognomeTxt;
    }

    public void setCognomeTxt(JTextField cognomeTxt) {
        this.cognomeTxt = cognomeTxt;
    }

    public JTextField getNomeTxt() {
        return nomeTxt;
    }

    public void setNomeTxt(JTextField nomeTxt) {
        this.nomeTxt = nomeTxt;
    }

    public JButton getConfermaBtn() {
        return confermaBtn;
    }

    public void setConfermaBtn(JButton confermaBtn) {
        this.confermaBtn = confermaBtn;
    }

    public JButton getIndietroBtn() {
        return indietroBtn;
    }

    public void setIndietroBtn(JButton indietroBtn) {
        this.indietroBtn = indietroBtn;
    }
}
