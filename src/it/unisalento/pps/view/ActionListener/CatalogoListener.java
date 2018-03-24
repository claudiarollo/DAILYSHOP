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


    public CatalogoListener(Frame frame){ this.frame = frame; }


    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if(sorgenteEvento.equals(VISUALIZZATUTTI)){

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


    }
}
