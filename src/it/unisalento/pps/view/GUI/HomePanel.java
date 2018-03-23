package it.unisalento.pps.view.GUI;

import javax.swing.*;

public class HomePanel {
    private JPanel homePanel;
    private JPanel sudPnl;
    private JLabel homeiconLbl;
    private JButton loginBtn;
    private JButton registratiBtn;
    private JButton VISUALIZZAILCATALOGOButton;


    public HomePanel(){
        homePanel.getUI();
        homePanel.setVisible(false);
    }


    public JPanel getHomePanel() {
        return homePanel;
    }

    public JPanel getSudPnl() {
        return sudPnl;
    }

    public JButton getLoginBtn() {
        return loginBtn;
    }

    public JButton getRegistratiBtn() {
        return registratiBtn;
    }

    public JButton getVISUALIZZAILCATALOGOButton() {
        return VISUALIZZAILCATALOGOButton;
    }
}
