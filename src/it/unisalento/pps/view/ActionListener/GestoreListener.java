package it.unisalento.pps.view.ActionListener;

import it.unisalento.pps.business.GestoreBusiness;
import it.unisalento.pps.business.ProdottoBusiness;
import it.unisalento.pps.model.Prodotto;
import it.unisalento.pps.view.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GestoreListener implements ActionListener {

    private Frame frame;

    public final static String AGGIUNGI_PRODOTTO = "Aggiungi il prodotto al catalogo";
    public final static String ELIMINA_PRODOTTO = "Elimina il prodotto dal catalogo";
    public final static String REFRESH_BTN = "Refresha la lista prodotti";
    public final static String LOGOUT = "Esegui logout da gestore";


    public GestoreListener(Frame frame){
        this.frame=frame;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if(sorgenteEvento.equals(AGGIUNGI_PRODOTTO)){

            try {
                String nome = frame.getGestorePanel().getNomeTxt().getText();
                String foto = frame.getGestorePanel().getFotoTxt().getText();
                String descrizione = frame.getGestorePanel().getDescrizioneTxt().getText();
                String prezzo = frame.getGestorePanel().getPrezzoTxt().getText();
                String sconto = frame.getGestorePanel().getScontoTxt().getText();
                String produttore = frame.getGestorePanel().getProduttoreTxt().getText();
                String distributore = frame.getGestorePanel().getDistributoreTxt().getText();
                String categoria = frame.getGestorePanel().getCategoriaBox().getSelectedItem().toString();
                String fascia = frame.getGestorePanel().getPrezzoBox().getSelectedItem().toString();
                String reparto = frame.getGestorePanel().getRepartoBox().getSelectedItem().toString();

                if(nome.isEmpty() || foto.isEmpty() || descrizione.isEmpty() || prezzo.isEmpty() || sconto.isEmpty() || produttore.isEmpty()
                        || distributore.isEmpty()){
                    JOptionPane.showMessageDialog(null, "E' necessario inserire tutti i campi per aggiungere un prodotto al catalogo...");
                }
                else {
                    GestoreBusiness gb = new GestoreBusiness();
                    gb.addProdotto(nome,foto,descrizione,prezzo,sconto,produttore,distributore,categoria,fascia,reparto);
                    JOptionPane.showMessageDialog(null, "Il nuovo prodotto è stato aggiunto con successo al catalogo.");

                    frame.getGestorePanel().getNomeTxt().setText(null);
                    frame.getGestorePanel().getFotoTxt().setText(null);
                    frame.getGestorePanel().getDescrizioneTxt().setText(null);
                    frame.getGestorePanel().getPrezzoTxt().setText(null);
                    frame.getGestorePanel().getScontoTxt().setText(null);
                    frame.getGestorePanel().getProduttoreTxt().setText(null);
                    frame.getGestorePanel().getDistributoreTxt().setText(null);
                }
            } catch (Exception e1){
                JOptionPane.showMessageDialog(null, "I caratteri inseriti non sono validi");
            }
        }


        if(sorgenteEvento.equals(ELIMINA_PRODOTTO)){

            if(frame.getGestorePanel().getProdottiList().getSelectedValue() == null){
                JOptionPane.showMessageDialog(null, "Seleziona il prodotto che vuoi eliminare");
            }
            else {
                GestoreBusiness gb = new GestoreBusiness();
                boolean esito = gb.deleteProdotto(frame.getGestorePanel().getProdottiList().getSelectedValue().toString());
                if (esito = true) {
                    JOptionPane.showMessageDialog(null, "Il prodotto selezionato è stato eliminato dal catalogo con successo.");
                    ProdottoBusiness pbusiness = new ProdottoBusiness();
                    ArrayList<Prodotto> listaProdotti = pbusiness.elencoNomeProdcts();
                    DefaultListModel model = new DefaultListModel();
                    for (int i = 0; i < listaProdotti.size(); i++) {
                        model.addElement(listaProdotti.get(i).getNome().toString());
                    }
                    frame.getGestorePanel().getProdottiList().setModel(model);
                }
                else
                    JOptionPane.showMessageDialog(null, "Ops! Qualcosa è andato storto...");
            }
        }


        if(sorgenteEvento.equals(REFRESH_BTN)){

            ProdottoBusiness pbusiness = new ProdottoBusiness();
            ArrayList<Prodotto> listaProdotti = pbusiness.elencoNomeProdcts();
            DefaultListModel model = new DefaultListModel();
            for (int i = 0; i < listaProdotti.size(); i++) {
                model.addElement(listaProdotti.get(i).getNome().toString());
            }
            frame.getGestorePanel().getProdottiList().setModel(model);
        }


        if(sorgenteEvento.equals(LOGOUT)){
            int dialogresult = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler effettuare il logout?");

            if (dialogresult == JOptionPane.YES_OPTION) {
                frame.getGestorePanel().getGestorePanel().setVisible(false);
                frame.getHomePanel().getHomePanel().setVisible(true);

                frame.getGestorePanel().getNomeTxt().setText(null);
                frame.getGestorePanel().getFotoTxt().setText(null);
                frame.getGestorePanel().getDescrizioneTxt().setText(null);
                frame.getGestorePanel().getPrezzoTxt().setText(null);
                frame.getGestorePanel().getScontoTxt().setText(null);
                frame.getGestorePanel().getProduttoreTxt().setText(null);
                frame.getGestorePanel().getDistributoreTxt().setText(null);
            }
            else if (dialogresult == JOptionPane.NO_OPTION) { }
        }
    }
}
