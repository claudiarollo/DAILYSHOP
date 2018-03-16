package it.unisalento.pps.view.GUI;

import javax.swing.*;
import java.awt.*;

public class RegistrazionePanel {
    private JPanel registrazionePanel;
    private JPanel centroPnl;
    private JPanel sudPnl;
    private JLabel nomeLbl;
    private JLabel cognomeLbl;
    private JLabel usernameLbl;
    private JLabel emailLbl;
    private JLabel passwordLbl;
    private JLabel indirizzoLbl;
    private JLabel cittàLbl;
    private JLabel provinciaLbl;
    private JLabel capLbl;
    private JLabel recapitoLbl;
    private JLabel codicecartaLbl;
    private JTextField nomeTxt;
    private JTextField cognomeTxt;
    private JTextField usernameTxt;
    private JTextField emailTxt;
    private JPasswordField passwordTxt;
    private JTextField indirizzoTxt;
    private JTextField cittàTxt;
    private JTextField provinciaTxt;
    private JTextField capTxt;
    private JTextField recapitoTxt;
    private JTextField codicecartaTxt;
    private JButton indietroBtn;
    private JButton registratiBtn;
    private JLabel cifrecartaLbl;
    private JLabel cifrecapLbl;
    private JPanel nordPnl;
    private JLabel logoLbl;


    public RegistrazionePanel(){
        registrazionePanel.getUI();
        registrazionePanel.setVisible(true);
    }


    public JPanel getRegistrazionePanel() {
        return registrazionePanel;
    }

    public JPanel getCentroPnl() {
        return centroPnl;
    }

    public JPanel getSudPnl() {
        return sudPnl;
    }

    public JTextField getNomeTxt() {
        return nomeTxt;
    }

    public JTextField getCognomeTxt() {
        return cognomeTxt;
    }

    public JTextField getUsernameTxt() {
        return usernameTxt;
    }

    public JTextField getEmailTxt() {
        return emailTxt;
    }

    public JPasswordField getPasswordTxt() {
        return passwordTxt;
    }

    public JTextField getIndirizzoTxt() {
        return indirizzoTxt;
    }

    public JTextField getCittàTxt() {
        return cittàTxt;
    }

    public JTextField getProvinciaTxt() {
        return provinciaTxt;
    }

    public JTextField getCapTxt() {
        return capTxt;
    }

    public JTextField getRecapitoTxt() {
        return recapitoTxt;
    }

    public JTextField getCodicecartaTxt() {
        return codicecartaTxt;
    }

    public JButton getIndietroBtn() {
        return indietroBtn;
    }

    public JButton getRegistratiBtn() {
        return registratiBtn;
    }
}
