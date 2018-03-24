package it.unisalento.pps.dao;

import it.unisalento.pps.dbinterface.DbConnection;
import it.unisalento.pps.model.Prodotto;

import java.util.ArrayList;
import java.util.Iterator;

public class ProdottoDAO {


    //singleton design pattern
    private static ProdottoDAO instance;

    public static ProdottoDAO getInstance() {
        if (instance == null)
            instance = new ProdottoDAO();
        return instance;
    }

    // per riempire la JList del catalogo con il nome dei prodotti
    public ArrayList<Prodotto> elencoNomiProdotti(){

        String query = "SELECT nome FROM prodotto";
        ArrayList<String[]> ris = DbConnection.getInstance().eseguiQuery(query);

        ArrayList<Prodotto> prodotti = new ArrayList<>();
        Iterator<String[]> i = ris.iterator();
        while (i.hasNext()) {
            String riga[] = i.next();
            Prodotto p = new Prodotto();
            p.setNome(riga[0]);
            prodotti.add(p);
        }
        return prodotti;
    }


    // per riempire la scheda prodotto con le info
    public Prodotto findInfoByNomeProdotto(String nome){
        String sql = "SELECT * FROM prodotto WHERE nome='"+nome+"'";
        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery(sql);

        String[] riga = risultato.get(0);
        Prodotto p = new Prodotto();
        p.setNome(riga[1]);
        p.setFoto(riga[2]);
        p.setDescrizione(riga[3]);
        p.setPrezzo(riga[4]);
        p.setSconto(riga[5]);
        p.setProduttore(riga[6]);
        p.setDistributore(riga[7]);
        return p;
    }
}
