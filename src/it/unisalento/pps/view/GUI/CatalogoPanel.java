package it.unisalento.pps.view.GUI;

import javax.swing.*;
import java.awt.*;

public class CatalogoPanel {
    private JPanel catalogoPnl;
    private JPanel sinistraPnl;
    private JPanel destraPnl;
    private JList prodottiList;
    private JLabel prodottoIcon;
    private JButton aggiungiAlCarrelloBtn;
    private JLabel nomeProdottoLbl;
    private JLabel descrizioneProdottoLbl;
    private JLabel prezzoProdottoLbl;
    private JLabel scontoProdottoLbl;
    private JLabel produttoreProdottoLbl;
    private JLabel distributoreProdottoLbl;
    private JButton vediInfoProdottoBtn;
    private JButton shoppingbagBtn;
    private JLabel numeroProdottiCarrelloLbl;


    public CatalogoPanel(){
        catalogoPnl.getUI();
        catalogoPnl.setVisible(true);
        
        catalogoPnl.setPreferredSize(new Dimension(1000,470));
    }



    public JButton getVediInfoProdottoBtn() {
        return vediInfoProdottoBtn;
    }

    public JPanel getCatalogoPnl() {
        return catalogoPnl;
    }

    public void setCatalogoPnl(JPanel catalogoPnl) {
        this.catalogoPnl = catalogoPnl;
    }

    public JPanel getSinistraPnl() {
        return sinistraPnl;
    }

    public void setSinistraPnl(JPanel sinistraPnl) {
        this.sinistraPnl = sinistraPnl;
    }

    public JPanel getDestraPnl() {
        return destraPnl;
    }

    public void setDestraPnl(JPanel destraPnl) {
        this.destraPnl = destraPnl;
    }

    public JList getProdottiList() {
        return prodottiList;
    }

    public void setProdottiList(JList prodottiList) {
        this.prodottiList = prodottiList;
    }

    public JLabel getProdottoIcon() {
        return prodottoIcon;
    }

    public void setProdottoIcon(JLabel prodottoIcon) {
        this.prodottoIcon = prodottoIcon;
    }

    public JButton getAggiungiAlCarrelloBtn() {
        return aggiungiAlCarrelloBtn;
    }

    public void setAggiungiAlCarrelloBtn(JButton aggiungiAlCarrelloBtn) {
        this.aggiungiAlCarrelloBtn = aggiungiAlCarrelloBtn;
    }

    public JLabel getNomeProdottoLbl() {
        return nomeProdottoLbl;
    }

    public void setNomeProdottoLbl(JLabel nomeProdottoLbl) {
        this.nomeProdottoLbl = nomeProdottoLbl;
    }

    public JLabel getDescrizioneProdottoLbl() {
        return descrizioneProdottoLbl;
    }

    public void setDescrizioneProdottoLbl(JLabel descrizioneProdottoLbl) {
        this.descrizioneProdottoLbl = descrizioneProdottoLbl;
    }

    public JLabel getPrezzoProdottoLbl() {
        return prezzoProdottoLbl;
    }

    public void setPrezzoProdottoLbl(JLabel prezzoProdottoLbl) {
        this.prezzoProdottoLbl = prezzoProdottoLbl;
    }

    public JLabel getScontoProdottoLbl() {
        return scontoProdottoLbl;
    }

    public void setScontoProdottoLbl(JLabel scontoProdottoLbl) {
        this.scontoProdottoLbl = scontoProdottoLbl;
    }

    public JLabel getProduttoreProdottoLbl() {
        return produttoreProdottoLbl;
    }

    public void setProduttoreProdottoLbl(JLabel produttoreProdottoLbl) {
        this.produttoreProdottoLbl = produttoreProdottoLbl;
    }

    public JLabel getDistributoreProdottoLbl() {
        return distributoreProdottoLbl;
    }

    public void setDistributoreProdottoLbl(JLabel distributoreProdottoLbl) {
        this.distributoreProdottoLbl = distributoreProdottoLbl;
    }

    public void setVediInfoProdottoBtn(JButton vediInfoProdottoBtn) {
        this.vediInfoProdottoBtn = vediInfoProdottoBtn;
    }

    public JButton getShoppingbagBtn() {
        return shoppingbagBtn;
    }

    public void setShoppingbagBtn(JButton shoppingbagBtn) {
        this.shoppingbagBtn = shoppingbagBtn;
    }

    public JLabel getNumeroProdottiCarrelloLbl() {
        return numeroProdottiCarrelloLbl;
    }

    public void setNumeroProdottiCarrelloLbl(JLabel numeroProdottiCarrelloLbl) {
        this.numeroProdottiCarrelloLbl = numeroProdottiCarrelloLbl;
    }
}
