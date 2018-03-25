package it.unisalento.pps.view.GUI;

import it.unisalento.pps.business.ProdottoBusiness;
import it.unisalento.pps.model.Prodotto;
import it.unisalento.pps.view.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class NordCatalogoPanel {
    private JPanel nordCatalogoPnl;
    private JPanel centerPnl;
    private JButton visualizzaTuttiBtn;
    private JButton categoriaBtn;
    private JButton fasciaPrezzoBtn;
    private JButton repartoBtn;
    private JComboBox categorieCBox;
    private JComboBox repartiCBox;
    private JComboBox fasceCBox;


    public NordCatalogoPanel(){
        nordCatalogoPnl.getUI();
        nordCatalogoPnl.setVisible(true);

        nordCatalogoPnl.setPreferredSize(new Dimension(1200,228));

        categorieCBox.setVisible(false);
        fasceCBox.setVisible(false);
        repartiCBox.setVisible(false);


        categorieCBox.addItem("Frutta e Verdura");
        categorieCBox.addItem("Pasta, Riso e Cereali");
        categorieCBox.addItem("Carni, Salumi e Affettati");
        categorieCBox.addItem("Pesce");
        categorieCBox.addItem("Formaggi e Latticini vari");
        categorieCBox.addItem("Pane, Uova e Condimenti");
        categorieCBox.addItem("Dolciumi e Snack");
        categorieCBox.addItem("Bevande");


        fasceCBox.addItem("€ - Fascia Bassa");
        fasceCBox.addItem("€€ - Fascia Media");
        fasceCBox.addItem("€€€ - Fascia Alta");


        repartiCBox.addItem("Ortofrutta");
        repartiCBox.addItem("Gastronomia");
        repartiCBox.addItem("Pescheria");
        repartiCBox.addItem("Macelleria");
        repartiCBox.addItem("Pasticceria");
    }


    public JPanel getNordCatalogoPnl() {
        return nordCatalogoPnl;
    }

    public JPanel getCenterPnl() {
        return centerPnl;
    }

    public JButton getVisualizzaTuttiBtn() {
        return visualizzaTuttiBtn;
    }

    public JButton getCategoriaBtn() {
        return categoriaBtn;
    }

    public JButton getFasciaPrezzoBtn() {
        return fasciaPrezzoBtn;
    }

    public JButton getRepartoBtn() { return repartoBtn; }

    public JComboBox getCategorieCBox() {
        return categorieCBox;
    }

    public JComboBox getRepartiCBox() {
        return repartiCBox;
    }

    public JComboBox getFasceCBox() {
        return fasceCBox;
    }
}
