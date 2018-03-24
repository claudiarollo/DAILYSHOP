package it.unisalento.pps.business;

import it.unisalento.pps.model.Prodotto;

import java.util.ArrayList;

public class ProdottoBusiness {

    //singleton pattern
    private static ProdottoBusiness instance;

    public static ProdottoBusiness getInstance() {
        if(instance == null)
            instance = new ProdottoBusiness();
        return instance;
    }


    // per riempire la JList del catalogo con il nome dei prodotti
    public ArrayList<Prodotto> elencoNomeProdcts() {
        Prodotto prodotto = new Prodotto();
        ArrayList<Prodotto> ris = prodotto.elencoNomeProducts();
        return ris;
    }


    // per riempire la scheda prodotto con le info
    public Prodotto trovaInfoByNomeProdotto(String nome){
        Prodotto p = new Prodotto();
        return p.findInfo(nome);
    }
}
