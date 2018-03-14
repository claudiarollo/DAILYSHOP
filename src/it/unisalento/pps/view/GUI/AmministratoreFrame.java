package it.unisalento.pps.view.GUI;

import it.unisalento.pps.business.UtenteRegistratoBusiness;
import it.unisalento.pps.model.UtenteRegistrato;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AmministratoreFrame extends JFrame {
    private JPanel mainPnl;
    private JPanel northPnl;
    private JLabel amministratoreLbl;
    private JPanel southPnl;
    private JButton gestisciutentiBtn;
    private JButton gestisciacquistiBtn;



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

    public JLabel getAmministratoreLbl() {
        return amministratoreLbl;
    }

    public void setAmministratoreLbl(JLabel amministratoreLbl) {
        this.amministratoreLbl = amministratoreLbl;
    }

    public JPanel getSouthPnl() {
        return southPnl;
    }

    public void setSouthPnl(JPanel southPnl) {
        this.southPnl = southPnl;
    }

    public JButton getGestisciutentiBtn() {
        return gestisciutentiBtn;
    }

    public void setGestisciutentiBtn(JButton gestisciutentiBtn) {
        this.gestisciutentiBtn = gestisciutentiBtn;
    }

    public JButton getGestisciacquistiBtn() {
        return gestisciacquistiBtn;
    }

    public void setGestisciacquistiBtn(JButton gestisciacquistiBtn) {
        this.gestisciacquistiBtn = gestisciacquistiBtn;
    }
}
