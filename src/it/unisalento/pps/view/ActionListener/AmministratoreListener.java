package it.unisalento.pps.view.ActionListener;

import it.unisalento.pps.business.AmministratoreBusiness;
import it.unisalento.pps.business.UtenteRegistratoBusiness;
import it.unisalento.pps.model.UtenteRegistrato;
import it.unisalento.pps.view.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AmministratoreListener implements ActionListener {

    private Frame frame;

    public final static String GESTISCINUOVIUTENTI = "Gestisci nuove richieste di registrazione";
    public final static String CONFERMAUTENTE = "Conferma la richiesta dell'utente selezionato";
    public final static String CONFERMATUTTI = "Conferma tutte le richieste di registrazione";
    public final static String RIFIUTAUTENTE = "Rifiuta la richiesta di un utente";
    public final static String RIFIUTATUTTI = "Rifiuta tutte le richieste di registrazione";
    public final static String INDIETRO_DA_GESTISCINUOVIUTENTI = "Torna indietro dal pannello gestisciNuoviUtenti";
    public final static String LOGOUT = "Logout con ritorno alla home";


    public AmministratoreListener(Frame frame){
        this.frame = frame;
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if(sorgenteEvento.equals(GESTISCINUOVIUTENTI)){

            frame.getGestisciNuoviUtentiPanel().getListaNuoviUtentiCBox().removeAllItems();
            UtenteRegistratoBusiness urb = new UtenteRegistratoBusiness();
            ArrayList<UtenteRegistrato> listaUtenti = urb.elencoNewUtenti();
            if(listaUtenti.size() == 0) {
                JOptionPane.showMessageDialog(null, "Non ci sono nuove richieste di registrazione");
            }
            else {
                for(int i = 0; i < listaUtenti.size(); i++) {
                    frame.getGestisciNuoviUtentiPanel().getListaNuoviUtentiCBox().addItem(listaUtenti.get(i).getUsername());
                }
                frame.getAmministratorePanel().getAmministratorePanel().setVisible(false);
                frame.getGestisciNuoviUtentiPanel().getGestisciNuoviUtentiPanel().setVisible(true);
            }
        }


        if(sorgenteEvento.equals(CONFERMAUTENTE)){

            try {
                int n = frame.getGestisciNuoviUtentiPanel().getListaNuoviUtentiCBox().getSelectedItem().hashCode();

                String nome = frame.getGestisciNuoviUtentiPanel().getListaNuoviUtentiCBox().getSelectedItem().toString();
                AmministratoreBusiness ab = new AmministratoreBusiness();
                boolean ris = ab.confermaNewUser(nome);

                if(ris == true){
                    JOptionPane.showMessageDialog(null, "La richiesta è stata accettata con successo");
                    frame.getGestisciNuoviUtentiPanel().getListaNuoviUtentiCBox().removeItem(n);
                }
                else
                    JOptionPane.showMessageDialog(null, "L'operazione non è andata a buon fine . . .");
            } catch (Exception e1){ }
        }


        if(sorgenteEvento.equals(CONFERMATUTTI)){

            try{
                AmministratoreBusiness ab = new AmministratoreBusiness();
                boolean ris = ab.confermaTuttiGliUtenti();

                if(ris == true){
                    JOptionPane.showMessageDialog(null, "Tutte le richieste sono state accettate con successo");
                    frame.getGestisciNuoviUtentiPanel().getListaNuoviUtentiCBox().removeAllItems();
                    frame.getGestisciNuoviUtentiPanel().getGestisciNuoviUtentiPanel().setVisible(false);
                    frame.getAmministratorePanel().getAmministratorePanel().setVisible(true);
                }
                else
                    JOptionPane.showMessageDialog(null, "L'operazione non è andata a buon fine . . .");
            } catch (Exception e1){ }
        }


        if(sorgenteEvento.equals(RIFIUTAUTENTE)){

            try {
                int p = frame.getGestisciNuoviUtentiPanel().getListaNuoviUtentiCBox().getSelectedItem().hashCode();

                String nome = frame.getGestisciNuoviUtentiPanel().getListaNuoviUtentiCBox().getSelectedItem().toString();
                AmministratoreBusiness ab = new AmministratoreBusiness();
                boolean ris = ab.rifiutaNewUser(nome);

                if(ris == true){
                    JOptionPane.showMessageDialog(null, "La richiesta è stata rifiutata con successo");
                    frame.getGestisciNuoviUtentiPanel().getListaNuoviUtentiCBox().removeItem(p);
                }
                else
                    JOptionPane.showMessageDialog(null, "L'operazione non è andata a buon fine . . .");
            } catch (Exception e1){ }
        }


        if(sorgenteEvento.equals(RIFIUTATUTTI)){

            try {
                AmministratoreBusiness ab = new AmministratoreBusiness();
                boolean ris = ab.rifiutaTuttiGliUtenti();

                if(ris == true){
                    JOptionPane.showMessageDialog(null, "Tutte le richieste sono state rifiutate con successo");
                    frame.getGestisciNuoviUtentiPanel().getListaNuoviUtentiCBox().removeAllItems();
                    frame.getGestisciNuoviUtentiPanel().getGestisciNuoviUtentiPanel().setVisible(false);
                    frame.getAmministratorePanel().getAmministratorePanel().setVisible(true);
                }
                else
                    JOptionPane.showMessageDialog(null, "L'operazione non è andata a buon fine . . .");
            } catch (Exception e1){ }
        }


        if(sorgenteEvento.equals(INDIETRO_DA_GESTISCINUOVIUTENTI)){
            frame.getGestisciNuoviUtentiPanel().getGestisciNuoviUtentiPanel().setVisible(false);
            frame.getAmministratorePanel().getAmministratorePanel().setVisible(true);
        }


        if(sorgenteEvento.equals(LOGOUT)){
            int dialogresult = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler effettuare il logout?");

            if (dialogresult == JOptionPane.YES_OPTION) {
                frame.getAmministratorePanel().getAmministratorePanel().setVisible(false);
                frame.getHomePanel().getHomePanel().setVisible(true);
            }
            else if (dialogresult == JOptionPane.NO_OPTION) { }
        }

    }
}
