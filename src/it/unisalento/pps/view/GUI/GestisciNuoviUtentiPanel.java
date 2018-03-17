package it.unisalento.pps.view.GUI;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GestisciNuoviUtentiPanel {
    private JPanel gestisciNuoviUtentiPanel;
    private JPanel centroPnl;
    private JPanel nordPnl;
    private JPanel sudPnl;
    private JLabel logosmallLbl;
    private JComboBox listaNuoviUtentiCBox;
    private JButton confermaUtenteBtn;
    private JButton confermaTuttiBtn;
    private JButton rifiutaUtenteBtn;
    private JButton rifiutaTuttiBtn;
    private JButton indietroBtn;
    private JLabel centroLbl;
    private JLabel areaLbl;


    public GestisciNuoviUtentiPanel(){
        gestisciNuoviUtentiPanel.getUI();
        gestisciNuoviUtentiPanel.setVisible(false);
    }



    public JPanel getGestisciNuoviUtentiPanel() {
        return gestisciNuoviUtentiPanel;
    }

    public JPanel getCentroPnl() {
        return centroPnl;
    }

    public JPanel getNordPnl() {
        return nordPnl;
    }

    public JPanel getSudPnl() {
        return sudPnl;
    }

    public JComboBox getListaNuoviUtentiCBox() {
        return listaNuoviUtentiCBox;
    }

    public JButton getConfermaUtenteBtn() {
        return confermaUtenteBtn;
    }

    public JButton getConfermaTuttiBtn() {
        return confermaTuttiBtn;
    }

    public JButton getRifiutaUtenteBtn() {
        return rifiutaUtenteBtn;
    }

    public JButton getRifiutaTuttiBtn() {
        return rifiutaTuttiBtn;
    }

    public JButton getIndietroBtn() {
        return indietroBtn;
    }
}
