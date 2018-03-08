package it.unisalento.pps.dao;

import it.unisalento.pps.dbinterface.DbConnection;
import it.unisalento.pps.model.Utente;

import java.util.ArrayList;

public class UtenteDAO {

    //singleton design pattern
    private static UtenteDAO instance;

    public static UtenteDAO getInstance() {
        if (instance == null)
            instance = new UtenteDAO();
        return instance;
    }


    public Utente findById(int id) {
        return null;
    }


    public ArrayList<Utente> findAll() {
        return null;
    }


    public Utente findUserByUsernameAndPassword(String username, String password) {

        String query = "SELECT * FROM utente WHERE " +
                "username = '" + username + "' AND " +
                "password = '" + password + "'";
        ArrayList<String[]> ris = DbConnection.getInstance().eseguiQuery(query);

        if (ris.isEmpty()) {
            return null;
        }
        else {
            Utente u = new Utente();
            String riga[]= ris.get(0);
            u.setUsername(riga[3]);
            u.setPassword(riga[5]);
            return u;
        }
    }


}
