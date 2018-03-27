package it.unisalento.pps.view.ActionListener;

import it.unisalento.pps.view.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestoreListener implements ActionListener {

    private Frame frame;

    public final static String AGGIUNGI_PRODOTTO = "Aggiungi il prodotto al catalogo";


    public GestoreListener(Frame frame){
        this.frame=frame;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if(e.equals(AGGIUNGI_PRODOTTO)){

            try {
                String nome = frame.getGestorePanel().getNomeTxt().getText();

            } catch (Exception e1){
                JOptionPane.showMessageDialog(null, "I caratteri inseriti non sono validi");
            }
        }
    }
}
