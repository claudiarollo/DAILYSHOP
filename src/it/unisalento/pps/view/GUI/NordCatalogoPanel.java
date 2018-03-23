package it.unisalento.pps.view.GUI;

import javax.swing.*;

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

        //getCategorieCBox().setVisible(false);
        //getFasceCBox().setVisible(false);
        //getRepartiCBox().setVisible(false);


        categorieCBox.addItem("Frutta e Verdura");
        categorieCBox.addItem("Pasta, Riso e Cereali");
        categorieCBox.addItem("Carne, Salumi e Affettati");
        categorieCBox.addItem("Pesce");
        categorieCBox.addItem("Formaggi e Latticini vari");
        categorieCBox.addItem("Pane, Uova e Condimenti");
        categorieCBox.addItem("Dolciumi e Snack");
        categorieCBox.addItem("Bevande");


        fasceCBox.addItem("€ - Fascia Bassa");
        fasceCBox.addItem("€€ - Fascia Media");
        fasceCBox.addItem("€€€ - Fascia Alta");


        repartiCBox.addItem("Gluten Free");
        repartiCBox.addItem("Vegan");
        repartiCBox.addItem("Bio");
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

    public JButton getRepartoBtn() {
        return repartoBtn;
    }

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
