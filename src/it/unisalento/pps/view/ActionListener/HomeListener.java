package it.unisalento.pps.view.ActionListener;

import javax.swing.*;
import it.unisalento.pps.view.Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeListener implements ActionListener {

    private Frame frame;

    public final static String LOGIN_BTN_HOME = "LoginBtnHome";
    public final static String REGISTRATI_BTN_HOME = "RegistratiBtnHome";
    public final static String VEDICATALOGO = "Visualizza il catalogo";


    public HomeListener(Frame frame){
        this.frame = frame;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if (sorgenteEvento.equals(LOGIN_BTN_HOME)){
            frame.getHomePanel().getHomePanel().setVisible(false);
            frame.getLoginPanel().getLoginPanel().setVisible(true);
        }
        else if (sorgenteEvento.equals(REGISTRATI_BTN_HOME)){
            frame.getHomePanel().getHomePanel().setVisible(false);
            frame.getRegistrazionePanel().getRegistrazionePanel().setVisible(true);
        }
        else if (sorgenteEvento.equals(VEDICATALOGO)){
            frame.getHomePanel().getHomePanel().setVisible(false);
            frame.getNordCatalogoPanel().getNordCatalogoPnl().setVisible(true);
            frame.getCatalogoPanel().getCatalogoPnl().setVisible(true);
        }
    }
}
