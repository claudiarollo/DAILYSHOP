package it.unisalento.pps.view.GUI;

import it.unisalento.pps.business.AmministratoreBusiness;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GestisciNuoviUtentiFrame extends JFrame {
    private JPanel mainPnl;
    private JPanel northPnl;
    private JLabel nuoviutentiLbl;
    private JPanel southPnl;
    private JPanel centerPnl;
    private JButton confermautenteBtn;
    private JButton confermatuttiBtn;
    private JButton rifiutautenteBtn;
    private JButton rifiutatuttiBtn;
    private JButton indietroBtn;
    private JComboBox elencoCbox;


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

    public JLabel getNuoviutentiLbl() {
        return nuoviutentiLbl;
    }

    public void setNuoviutentiLbl(JLabel nuoviutentiLbl) {
        this.nuoviutentiLbl = nuoviutentiLbl;
    }

    public JPanel getSouthPnl() {
        return southPnl;
    }

    public void setSouthPnl(JPanel southPnl) {
        this.southPnl = southPnl;
    }

    public JPanel getCenterPnl() {
        return centerPnl;
    }

    public void setCenterPnl(JPanel centerPnl) {
        this.centerPnl = centerPnl;
    }

    public JButton getConfermautenteBtn() {
        return confermautenteBtn;
    }

    public void setConfermautenteBtn(JButton confermautenteBtn) {
        this.confermautenteBtn = confermautenteBtn;
    }

    public JButton getConfermatuttiBtn() {
        return confermatuttiBtn;
    }

    public void setConfermatuttiBtn(JButton confermatuttiBtn) {
        this.confermatuttiBtn = confermatuttiBtn;
    }

    public JButton getRifiutautenteBtn() {
        return rifiutautenteBtn;
    }

    public void setRifiutautenteBtn(JButton rifiutautenteBtn) {
        this.rifiutautenteBtn = rifiutautenteBtn;
    }

    public JButton getRifiutatuttiBtn() {
        return rifiutatuttiBtn;
    }

    public void setRifiutatuttiBtn(JButton rifiutatuttiBtn) {
        this.rifiutatuttiBtn = rifiutatuttiBtn;
    }

    public JButton getIndietroBtn() {
        return indietroBtn;
    }

    public void setIndietroBtn(JButton indietroBtn) {
        this.indietroBtn = indietroBtn;
    }

    public JComboBox getElencoCbox() {
        return elencoCbox;
    }

    public void setElencoCbox(JComboBox elencoCbox) {
        this.elencoCbox = elencoCbox;
    }
}
