package it.unisalento.pps.business;

import it.unisalento.pps.dao.ProdottoDAO;
import it.unisalento.pps.model.Prodotto;

public class GestoreBusiness {

    //singleton pattern
    private static GestoreBusiness instance;

    public static GestoreBusiness getInstance() {
        if(instance == null)
            instance = new GestoreBusiness();
        return instance;
    }


    // per aggiungere un prodotto al catalogo

    public boolean addProdotto(String nome, String foto, String descrizione, String prezzo, String sconto, String produttore, String distributore,
                               String categoria, String fascia, String reparto){
        Prodotto p = new Prodotto();
        p.setNome(nome);
        p.setFoto(foto);
        p.setDescrizione(descrizione);
        p.setPrezzo(prezzo);
        p.setSconto(sconto);
        p.setProduttore(produttore);
        p.setDistributore(distributore);
        p.setCategoria(categoria);
        p.setFascia(fascia);
        p.setReparto(reparto);
        p.aggiungiProdotto(p);
        return true;
    }


    // per eliminare un prodotto dal catalogo

    public boolean deleteProdotto(String nome){
        Prodotto p = new Prodotto();
        boolean conferma = p.eliminaProdotto(nome);
        if (conferma == true)
            return true;
        else
            return false;
    }


}
