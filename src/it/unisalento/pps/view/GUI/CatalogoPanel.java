package it.unisalento.pps.view.GUI;

import it.unisalento.pps.business.ProdottoBusiness;
import it.unisalento.pps.model.Prodotto;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.text.DecimalFormat;

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
    private JPanel destraPnl1;
    private JButton backhomeBtn;
    private JPanel sinistraPnl1;
    private JButton creaIlTuoPaniereButton;
    private JLabel pscontLbl;
    private JLabel prezzoScontatoLbl;


    public CatalogoPanel(){
        catalogoPnl.getUI();
        catalogoPnl.setVisible(false);
        
        catalogoPnl.setPreferredSize(new Dimension(1150,465));
        destraPnl.setPreferredSize(new Dimension(410,465));

        prodottiList.addListSelectionListener(new listaProdottiListener());
    }


    public class listaProdottiListener implements ListSelectionListener{
        @Override
        public void valueChanged(ListSelectionEvent e) {
            try{
                if(e.getSource() == prodottiList) {

                    nomeProdottoLbl.setText(null);
                    prodottoIcon.setIcon(null);
                    descrizioneProdottoLbl.setText(null);
                    prezzoProdottoLbl.setText(null);
                    scontoProdottoLbl.setText(null);
                    produttoreProdottoLbl.setText(null);
                    distributoreProdottoLbl.setText(null);

                    //if(prodottiList.getSelectedValue().toString() == null) return;

                    ProdottoBusiness pb = new ProdottoBusiness();
                    nomeProdottoLbl.setText(pb.trovaInfoByNomeProdotto(prodottiList.getSelectedValue().toString()).getNome());
                    prodottoIcon.setIcon(new ImageIcon("./Icons/" + pb.trovaInfoByNomeProdotto(prodottiList.getSelectedValue().toString()).getFoto()));
                    descrizioneProdottoLbl.setText(pb.trovaInfoByNomeProdotto(prodottiList.getSelectedValue().toString()).getDescrizione());
                    prezzoProdottoLbl.setText(pb.trovaInfoByNomeProdotto(prodottiList.getSelectedValue().toString()).getPrezzo());
                    scontoProdottoLbl.setText(pb.trovaInfoByNomeProdotto(prodottiList.getSelectedValue().toString()).getSconto());
                    produttoreProdottoLbl.setText(pb.trovaInfoByNomeProdotto(prodottiList.getSelectedValue().toString()).getProduttore());
                    distributoreProdottoLbl.setText(pb.trovaInfoByNomeProdotto(prodottiList.getSelectedValue().toString()).getDistributore());

                    //calcola gli sconti
                    if(pb.trovaInfoByNomeProdotto(prodottiList.getSelectedValue().toString()).getSconto().equals("Non sono disponibili sconti")){
                        pscontLbl.setVisible(false);
                        prezzoScontatoLbl.setVisible(false);
                    }
                    else {
                        pscontLbl.setVisible(true);
                        prezzoScontatoLbl.setVisible(true);
                        double a =Double.parseDouble(pb.trovaInfoByNomeProdotto(prodottiList.getSelectedValue().toString()).getPrezzo());
                        double b =Double.parseDouble(pb.trovaInfoByNomeProdotto(prodottiList.getSelectedValue().toString()).getSconto());
                        double result =  (a - (a * (b/ 100)));
                        String res = String.format("%.2f", result);
                        prezzoScontatoLbl.setText(res);
                        //pr
                    }
                }
            }
            catch (Exception e1){}
        }
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

    public void setAggiungiAlCarrelloBtn(JButton aggiungiAlCarrelloBtn) { this.aggiungiAlCarrelloBtn = aggiungiAlCarrelloBtn; }

    public JLabel getNomeProdottoLbl() {
        return nomeProdottoLbl;
    }

    public void setNomeProdottoLbl(JLabel nomeProdottoLbl) {
        this.nomeProdottoLbl = nomeProdottoLbl;
    }

    public JLabel getDescrizioneProdottoLbl() {
        return descrizioneProdottoLbl;
    }

    public void setDescrizioneProdottoLbl(JLabel descrizioneProdottoLbl) { this.descrizioneProdottoLbl = descrizioneProdottoLbl; }

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

    public void setProduttoreProdottoLbl(JLabel produttoreProdottoLbl) { this.produttoreProdottoLbl = produttoreProdottoLbl; }

    public JLabel getDistributoreProdottoLbl() {
        return distributoreProdottoLbl;
    }

    public void setDistributoreProdottoLbl(JLabel distributoreProdottoLbl) { this.distributoreProdottoLbl = distributoreProdottoLbl; }

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

    public void setNumeroProdottiCarrelloLbl(JLabel numeroProdottiCarrelloLbl) { this.numeroProdottiCarrelloLbl = numeroProdottiCarrelloLbl; }

    public JPanel getDestraPnl1() {
        return destraPnl1;
    }

    public void setDestraPnl1(JPanel destraPnl1) {
        this.destraPnl1 = destraPnl1;
    }

    public JButton getBackhomeBtn() {
        return backhomeBtn;
    }

    public JLabel getPscontLbl() {
        return pscontLbl;
    }

    public void setPscontLbl(JLabel pscontLbl) {
        this.pscontLbl = pscontLbl;
    }

    public JLabel getPrezzoScontatoLbl() {
        return prezzoScontatoLbl;
    }

    public void setPrezzoScontatoLbl(JLabel prezzoScontatoLbl) {
        this.prezzoScontatoLbl = prezzoScontatoLbl;
    }
}
