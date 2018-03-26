package it.unisalento.pps.view.ActionListener;

import it.unisalento.pps.business.ProdottoBusiness;
import it.unisalento.pps.model.Prodotto;
import it.unisalento.pps.view.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class ComboBoxListener implements ItemListener {

    private Frame frame;

    public ComboBoxListener(Frame frame){this.frame=frame;}


    @Override
    public void itemStateChanged(ItemEvent e) {

        if(frame.getNordCatalogoPanel().getCategorieCBox().isPopupVisible()) {

            ProdottoBusiness pb = new ProdottoBusiness();
            ArrayList<Prodotto> listaPerCategoria = pb.trovaListaByCategoria(frame.getNordCatalogoPanel().getCategorieCBox().getSelectedItem().toString());
            if (listaPerCategoria.size() == 0) {
                JOptionPane.showMessageDialog(null, "Non ci sono prodotti che fanno parte di questa categoria. Siamo spiacenti...");

                DefaultListModel model = new DefaultListModel();
                frame.getCatalogoPanel().getProdottiList().setModel(model);
                model.clear();
            }
            else {
                DefaultListModel model = new DefaultListModel();
                for (int i = 0; i < listaPerCategoria.size(); i++) {
                    model.addElement(listaPerCategoria.get(i).getNome().toString());
                }
                frame.getCatalogoPanel().getProdottiList().setModel(model);
                frame.getCatalogoPanel().getProdottiList().setSelectedIndex(0);
            }
        }


        if(frame.getNordCatalogoPanel().getFasceCBox().isPopupVisible()) {

            ProdottoBusiness pb = new ProdottoBusiness();
            ArrayList<Prodotto> listaPerFascia = pb.trovaListaByFascia(frame.getNordCatalogoPanel().getFasceCBox().getSelectedItem().toString());
            if(listaPerFascia.size()==0) {
                JOptionPane.showMessageDialog(null, "Non ci sono prodotti che fanno parte di questa fascia. Siamo spiacenti...");

                DefaultListModel model = new DefaultListModel();
                frame.getCatalogoPanel().getProdottiList().setModel(model);
                model.clear();
            }
            else {
                DefaultListModel model = new DefaultListModel();
                for (int i = 0; i < listaPerFascia.size(); i++) {
                    model.addElement(listaPerFascia.get(i).getNome().toString());
                }
                frame.getCatalogoPanel().getProdottiList().setModel(model);
                frame.getCatalogoPanel().getProdottiList().setSelectedIndex(0);
            }
        }


        if(frame.getNordCatalogoPanel().getRepartiCBox().isPopupVisible()){

            ProdottoBusiness pb = new ProdottoBusiness();
            ArrayList<Prodotto> listaPerReparto = pb.trovaListaByReparto(frame.getNordCatalogoPanel().getRepartiCBox().getSelectedItem().toString());
            if(listaPerReparto.size()==0) {
                JOptionPane.showMessageDialog(null, "Non ci sono prodotti che fanno parte di questo reparto. Siamo spiacenti...");

                DefaultListModel model = new DefaultListModel();
                frame.getCatalogoPanel().getProdottiList().setModel(model);
                model.clear();
            }
            else {
                DefaultListModel model = new DefaultListModel();
                for (int i = 0; i < listaPerReparto.size(); i++) {
                    model.addElement(listaPerReparto.get(i).getNome().toString());
                }
                frame.getCatalogoPanel().getProdottiList().setModel(model);
                frame.getCatalogoPanel().getProdottiList().setSelectedIndex(0);
            }
        }

    }
}
