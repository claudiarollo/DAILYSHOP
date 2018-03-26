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

                frame.getCatalogoPanel().getProdottiList().setSelectedIndex(0);
            }
        }


        if(sorgenteEvento.equals(GO_BACK_HOME)){
            frame.getNordCatalogoPanel().getNordCatalogoPnl().setVisible(false);
            frame.getCatalogoPanel().getCatalogoPnl().setVisible(false);
            frame.getHomePanel().getHomePanel().setVisible(true);
            frame.getNordCatalogoPanel().getCategorieCBox().setVisible(false);
            frame.getNordCatalogoPanel().getRepartiCBox().setVisible(false);
            frame.getNordCatalogoPanel().getFasceCBox().setVisible(false);

            DefaultListModel model = new DefaultListModel();
            frame.getCatalogoPanel().getProdottiList().setModel(model);
            model.clear();
        }


        if(sorgenteEvento.equals(PER_CATEGORIA)){
            frame.getNordCatalogoPanel().getCategorieCBox().setVisible(true);
            frame.getNordCatalogoPanel().getFasceCBox().setVisible(false);
            frame.getNordCatalogoPanel().getRepartiCBox().setVisible(false);

            ProdottoBusiness pb = new ProdottoBusiness();
            ArrayList<Prodotto> listaPerCategoria = pb.trovaListaByCategoria("Frutta e Verdura");
            DefaultListModel model = new DefaultListModel();
            for (int i = 0; i < listaPerCategoria.size(); i++) {
                model.addElement(listaPerCategoria.get(i).getNome().toString());
            }
            frame.getCatalogoPanel().getProdottiList().setModel(model);
            frame.getCatalogoPanel().getProdottiList().setSelectedIndex(0);

            frame.getNordCatalogoPanel().getCategorieCBox().setSelectedItem("Frutta e Verdura");
        }


        if(sorgenteEvento.equals(PER_FASCIA)){
            frame.getNordCatalogoPanel().getCategorieCBox().setVisible(false);
            frame.getNordCatalogoPanel().getRepartiCBox().setVisible(false);
            frame.getNordCatalogoPanel().getFasceCBox().setVisible(true);

            ProdottoBusiness pb = new ProdottoBusiness();
            ArrayList<Prodotto> listaPerFascia = pb.trovaListaByFascia("€ - Fascia Bassa");
            DefaultListModel model = new DefaultListModel();
            for (int i = 0; i < listaPerFascia.size(); i++) {
                model.addElement(listaPerFascia.get(i).getNome().toString());
            }
            frame.getCatalogoPanel().getProdottiList().setModel(model);
            frame.getCatalogoPanel().getProdottiList().setSelectedIndex(0);

            frame.getNordCatalogoPanel().getFasceCBox().setSelectedItem("€ - Fascia Bassa");
        }


        if(sorgenteEvento.equals(PER_REPARTO)){
            frame.getNordCatalogoPanel().getCategorieCBox().setVisible(false);
            frame.getNordCatalogoPanel().getFasceCBox().setVisible(false);
            frame.getNordCatalogoPanel().getRepartiCBox().setVisible(true);

            ProdottoBusiness pb = new ProdottoBusiness();
            ArrayList<Prodotto> listaPerReparto = pb.trovaListaByReparto("Ortofrutta");
            DefaultListModel model = new DefaultListModel();
            for (int i = 0; i < listaPerReparto.size(); i++) {
                model.addElement(listaPerReparto.get(i).getNome().toString());
            }
            frame.getCatalogoPanel().getProdottiList().setModel(model);
            frame.getCatalogoPanel().getProdottiList().setSelectedIndex(0);

            frame.getNordCatalogoPanel().getRepartiCBox().setSelectedItem("Ortofrutta");
        }

    }
}
