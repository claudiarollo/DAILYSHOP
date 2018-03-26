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
        Prodotto p = new Prodotto();
        ArrayList<Prodotto> ris = p.elencoNomeProducts();
        return ris;
    }


    // trova la lista con nomi dei prodotti per categoria
    public ArrayList<Prodotto> trovaListaByCategoria(String categoria){
        Prodotto p = new Prodotto();
        ArrayList<Prodotto> ris = p.findListByCategoria(categoria);
        return ris;
    }


    public ArrayList<Prodotto> trovaListaByFascia(String fascia){
        Prodotto p = new Prodotto();
        ArrayList<Prodotto> ris = p.findListByFascia(fascia);
        return ris;
    }


    public ArrayList<Prodotto> trovaListaByReparto(String reparto){
        Prodotto p = new Prodotto();
        ArrayList<Prodotto> ris = p.findListByReparto(reparto);
        return ris;
    }


    // per riempire la scheda prodotto con le info
    public Prodotto trovaInfoByNomeProdotto(String nome){
        Prodotto p = new Prodotto();
        return p.findInfo(nome);
    }
}
