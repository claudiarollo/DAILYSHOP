package it.unisalento.pps.view.ActionListener;

import it.unisalento.pps.business.UtenteBusiness;
import it.unisalento.pps.business.UtenteRegistratoBusiness;
import it.unisalento.pps.model.UtenteRegistrato;
import it.unisalento.pps.view.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrazioneListener implements ActionListener {

    private Frame frame;

    public final static String REGISTRATI_BTN = "RegistratiBtn";


    public RegistrazioneListener(Frame frame) {
        this.frame = frame;
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();


        if(sorgenteEvento.equals(REGISTRATI_BTN)) {

            try {
                String nome = frame.getRegistrazionePanel().getNomeTxt().getText();
                String cognome = frame.getRegistrazionePanel().getCognomeTxt().getText();
                String username = frame.getRegistrazionePanel().getUsernameTxt().getText();
                String email = frame.getRegistrazionePanel().getEmailTxt().getText();
                String password = new String(frame.getRegistrazionePanel().getPasswordTxt().getPassword());
                String indirizzo = frame.getRegistrazionePanel().getIndirizzoTxt().getText();
                String città = frame.getRegistrazionePanel().getCittàTxt().getText();
                String provincia = frame.getRegistrazionePanel().getProvinciaTxt().getText();
                String cap = frame.getRegistrazionePanel().getCapTxt().getText();
                String recapito = frame.getRegistrazionePanel().getRecapitoTxt().getText();
                String codicecarta = frame.getRegistrazionePanel().getCodicecartaTxt().getText();

                if (nome.isEmpty() || cognome.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || indirizzo.isEmpty()
                        || città.isEmpty() || provincia.isEmpty() || cap.isEmpty() || recapito.isEmpty() || codicecarta.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "E' necessario inserire tutti i campi per registrarsi");
                }
                else {
                    UtenteBusiness ub = new UtenteBusiness();
                    boolean esitoUser = ub.controllaUsername(username);
                    boolean esitoMail = ub.controllaEmail(email);

                    if (esitoUser==false && esitoMail==false) {
                        UtenteRegistratoBusiness urb = new UtenteRegistratoBusiness();
                        urb.effettuaRegistrazione(nome, cognome, username, email, password, indirizzo, città, provincia, cap, recapito, codicecarta);
                        JOptionPane.showMessageDialog(null, "Richiesta di registrazione effettuata con successo. " +
                                                        "Attendi di essere confermato dall'amministratore");
                    }
                    else if (esitoUser==true && esitoMail==false)
                        JOptionPane.showMessageDialog(null, "Il tuo username è stato già scelto da qualcuno. Per favore " +
                                                        "scegli un altro username");
                    else if (esitoUser==false && esitoMail==true)
                        JOptionPane.showMessageDialog(null, "Questa email è già in uso!");
                }
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "I caratteri inseriti non sono validi");
            }
        }
    }
}
