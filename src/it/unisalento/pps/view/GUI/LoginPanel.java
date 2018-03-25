package it.unisalento.pps.view.GUI;

import javax.swing.*;
import java.awt.*;

public class LoginPanel {
    private JPanel loginPanel;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JTextField usernameTxt;
    private JPasswordField passwordTxt;
    private JButton indietroBtn;
    private JButton loginBtn;
    private JLabel logoLbl;


    public LoginPanel() {
        loginPanel.getUI();
        loginPanel.setVisible(false);
    }


    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public JLabel getUsernameLbl() {
        return usernameLbl;
    }

    public JLabel getPasswordLbl() {
        return passwordLbl;
    }

    public JTextField getUsernameTxt() {
        return usernameTxt;
    }

    public JPasswordField getPasswordTxt() {
        return passwordTxt;
    }

    public JButton getIndietroBtn() {
        return indietroBtn;
    }

    public JButton getLoginBtn() {
        return loginBtn;
    }
}
