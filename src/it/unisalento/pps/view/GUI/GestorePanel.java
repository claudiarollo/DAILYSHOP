package it.unisalento.pps.view.GUI;

import javax.swing.*;
import java.awt.*;

public class GestorePanel {
    private JPanel gestorePanel;
    private JPanel mainPnl;
    private JPanel topPnl;
    private JPanel aggiungiProdottoPnl;
    private JPanel eliminaProdottoPnl;
    private JComboBox repartoBox;
    private JComboBox prezzoBox;
    private JComboBox categoriaBox;
    private JTextField nomeTxt;
    private JTextField fotoTxt;
    private JTextField descrizioneTxt;
    private JTextField prezzoTxt;
    private JTextField scontoTxt;
    private JTextField produttoreTxt;
    private JTextField distributoreTxt;
    private JButton aggiungiProdottoBtn;
    private JPanel cancellaProdottoPnl;


    public GestorePanel(){
        gestorePanel.getUI();
        gestorePanel.setVisible(true);

        gestorePanel.setPreferredSize(new Dimension(900, 650));


        categoriaBox.addItem("Frutta e Verdura");
        categoriaBox.addItem("Pasta, Riso e Cereali");
        categoriaBox.addItem("Carni, Salumi e Affettati");
        categoriaBox.addItem("Pesce");
        categoriaBox.addItem("Formaggi e Latticini vari");
        categoriaBox.addItem("Pane, Uova e Condimenti");
        categoriaBox.addItem("Dolciumi e Snack");
        categoriaBox.addItem("Bevande");


        prezzoBox.addItem("€ - Fascia Bassa");
        prezzoBox.addItem("€€ - Fascia Media");
        prezzoBox.addItem("€€€ - Fascia Alta");


        repartoBox.addItem("Ortofrutta");
        repartoBox.addItem("Gastronomia");
        repartoBox.addItem("Pescheria");
        repartoBox.addItem("Macelleria");
        repartoBox.addItem("Pasticceria");
    }


    public JPanel getGestorePanel() {
        return gestorePanel;
    }

    public JPanel getTopPnl() {
        return topPnl;
    }

    public JPanel getAggiungiProdottoPnl() {
        return aggiungiProdottoPnl;
    }

    public JPanel getCancellaProdottoPnl() {
        return cancellaProdottoPnl;
    }

    public JPanel getMainPnl() {
        return mainPnl;
    }

    public JPanel getEliminaProdottoPnl() {
        return eliminaProdottoPnl;
    }

    public JComboBox getRepartoBox() {
        return repartoBox;
    }

    public JComboBox getPrezzoBox() {
        return prezzoBox;
    }

    public JComboBox getCategoriaBox() {
        return categoriaBox;
    }

    public JTextField getNomeTxt() {
        return nomeTxt;
    }

    public JTextField getFotoTxt() {
        return fotoTxt;
    }

    public JTextField getDescrizioneTxt() {
        return descrizioneTxt;
    }

    public JTextField getPrezzoTxt() {
        return prezzoTxt;
    }

    public JTextField getScontoTxt() {
        return scontoTxt;
    }

    public JTextField getProduttoreTxt() {
        return produttoreTxt;
    }

    public JTextField getDistributoreTxt() {
        return distributoreTxt;
    }

    public JButton getAggiungiProdottoBtn() {
        return aggiungiProdottoBtn;
    }
}
