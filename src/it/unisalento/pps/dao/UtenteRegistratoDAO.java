package it.unisalento.pps.dao;

import it.unisalento.pps.dbinterface.DbConnection;
import it.unisalento.pps.model.UtenteRegistrato;

import java.util.ArrayList;
import java.util.Iterator;

public class UtenteRegistratoDAO {

    //singleton design pattern
    private static UtenteRegistratoDAO instance;

    public static UtenteRegistratoDAO getInstance() {
        if (instance == null)
            instance = new UtenteRegistratoDAO();
        return instance;
    }

    //

    // per effettuare la registrazione
    public boolean registrazione(UtenteRegistrato registrato) {

        String query = "INSERT INTO utente(nome,cognome,username,email,password,ruolo,statoregistrazione,indirizzo,città,provincia,cap," +
                        "recapito,codicecarta) VALUES('"+registrato.getNome()+"','"+registrato.getCognome()+"','"+registrato.getUsername()+
                        "','"+registrato.getEmail()+"','"+registrato.getPassword()+"','registrato', '1', '"+registrato.getIndirizzo()+
                        "', '"+registrato.getCittà()+"', '"+registrato.getProvincia()+"', '"+registrato.getCap()+"', " +
                        "'"+registrato.getRecapito()+"', '"+registrato.getCodicecarta()+"')";
        boolean ris = DbConnection.getInstance().eseguiAggiornamento(query);
        return ris;
    }

    //permette all'admin di vedere le richieste di registrazione come elenco
    public ArrayList<UtenteRegistrato> elencoNuoviUtenti() {

        String sql = "SELECT * FROM utente WHERE statoregistrazione='1'";
        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery(sql);
        ArrayList<UtenteRegistrato> nuoviutenti = new ArrayList<>();
        Iterator<String[]> i = risultato.iterator();
        while(i.hasNext()) {
            String riga[] = i.next();
            UtenteRegistrato ur = new UtenteRegistrato();
            //ur.setIdUtente(Integer.parseInt(riga[0]));
            ur.setUsername(riga[3]);
            //ur.setEmail(riga[4]);
            nuoviutenti.add(ur);
        }
        return nuoviutenti;
    }

    //conferma la richiesta di un utente
    public boolean confermaUtente(String username) {
        String sql = "UPDATE utente SET statoregistrazione='0' WHERE username= '"+username+"'";
        return DbConnection.getInstance().eseguiAggiornamento(sql);
    }

    //conferma tutte le richieste
    public boolean confermaTutti() {
        String sql = "UPDATE utente SET statoregistrazione='0' WHERE statoregistrazione='1'";
        return DbConnection.getInstance().eseguiAggiornamento(sql);
    }

    //rifiuta utente
    public boolean rifiutaUtente(String username) {
        String s = "DELETE FROM utente WHERE username = '"+username+"'";
        return DbConnection.getInstance().eseguiAggiornamento(s);
    }

    //rifiuta tutti
    public boolean rifiutaTutti() {
        String s = "DELETE FROM utente WHERE statoregistrazione='1'";
        return DbConnection.getInstance().eseguiAggiornamento(s);
    }


}
