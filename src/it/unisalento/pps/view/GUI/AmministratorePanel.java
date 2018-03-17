package it.unisalento.pps.view.GUI;

import javax.swing.*;

public class AmministratorePanel {
    private JPanel amministratorePanel;
    private JPanel centroPnl;
    private JPanel nordcentroPnl;
    private JButton gestisciUtentiBtn;
    private JButton gestisciAcquistiBtn;
    private JButton logoutBtn;
    private JLabel logosmallLbl;


    public AmministratorePanel() {
        amministratorePanel.getUI();
        amministratorePanel.setVisible(false);
    }


    public JPanel getAmministratorePanel() {
        return amministratorePanel;
    }

    public JPanel getCentroPnl() {
        return centroPnl;
    }

    public JPanel getNordcentroPnl() {
        return nordcentroPnl;
    }

    public JButton getGestisciUtentiBtn() {
        return gestisciUtentiBtn;
    }

    public JButton getGestisciAcquistiBtn() {
        return gestisciAcquistiBtn;
    }

    public JButton getLogoutBtn() {
        return logoutBtn;
    }
}
