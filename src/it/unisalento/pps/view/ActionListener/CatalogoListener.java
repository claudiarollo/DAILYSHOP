package it.unisalento.pps.view.ActionListener;

import it.unisalento.pps.business.ProdottoBusiness;
import it.unisalento.pps.model.Prodotto;
import it.unisalento.pps.view.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CatalogoListener implements ActionListener {

    private Frame frame;

    public final static String VISUALIZZATUTTI = "Visualizza tutti i nomi dei prodotti";
    public final static String GO_BACK_HOME = "Torna alla home da catalogo";
    public final static String PER_CATEGORIA = "Visualizza i prodotti di quella categoria";
    public final static String PER_FASCIA = "Visualizza i prodotti di quella fascia";
    public final static String PER_REPARTO = "Visualizza i prodotti di quel reparto";


    public CatalogoListener(Frame frame){ this.frame = frame; }


    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if(sorgenteEvento.equals(VISUALIZZATUTTI)){

            frame.getNordCatalogoPanel().getCategorieCBox().setVisible(false);
            frame.getNordCatalogoPanel().getFasceCBox().setVisible(false);
            frame.getNordCatalogoPanel().getRepartiCBox().setVisible(false);

            ProdottoBusiness pbusiness = new ProdottoBusiness();
            ArrayList<Prodotto> listaProdotti = pbusiness.elencoNomeProdcts();
            if(listaProdotti.size() == 0) {
                JOptionPane.showMessageDialog(null, "Non ci sono prodotti nel catalogo");
            }
            else {
                DefaultListModel model = new DefaultListModel();
                for (int i = 0; i < listaProdotti.size(); i++) {
                    model.addElement(listaProdotti.get(i).getNome().toString());
                }
                frame.getCatalogoPanel().getProdottiList().setModel(model);
            }
        }


        if(sorgenteEvento.equals(GO_BACK_HOME)){
            frame.getNordCatalogoPanel().getNordCatalogoPnl().setVisible(false);
            frame.getCatalogoPanel().getCatalogoPnl().setVisible(false);
            frame.getHomePanel().getHomePanel().setVisible(true);
        }


        if(sorgenteEvento.equals(PER_CATEGORIA)){
            frame.getNordCatalogoPanel().getCategorieCBox().setVisible(true);
            frame.getNordCatalogoPanel().getFasceCBox().setVisible(false);
            frame.getNordCatalogoPanel().getRepartiCBox().setVisible(false);

            DefaultListModel model = new DefaultListModel();
            frame.getCatalogoPanel().getProdottiList().setModel(model);
            model.clear();
        }


        if(sorgenteEvento.equals(PER_FASCIA)){
            frame.getNordCatalogoPanel().getCategorieCBox().setVisible(false);
            frame.getNordCatalogoPanel().getRepartiCBox().setVisible(false);
            frame.getNordCatalogoPanel().getFasceCBox().setVisible(true);

            DefaultListModel model = new DefaultListModel();
            frame.getCatalogoPanel().getProdottiList().setModel(model);
            model.clear();
        }


        if(sorgenteEvento.equals(PER_REPARTO)){
            frame.getNordCatalogoPanel().getCategorieCBox().setVisible(false);
            frame.getNordCatalogoPanel().getFasceCBox().setVisible(false);
            frame.getNordCatalogoPanel().getRepartiCBox().setVisible(true);

            DefaultListModel model = new DefaultListModel();
            frame.getCatalogoPanel().getProdottiList().setModel(model);
            model.clear();
        }

    }
}
