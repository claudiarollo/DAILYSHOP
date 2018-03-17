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

    public Utente findUserByUsernameAndPassword(String username, String password) {
        String query = "SELECT * FROM utente WHERE " +
                "username = '" + username + "' AND " +
                "password = '" + password + "' AND statoregistrazione = '0'";
        ArrayList<String[]> ris = DbConnection.getInstance().eseguiQuery(query);

        if (ris.isEmpty()) {
            return null;
        }
        else {
            Utente u = new Utente();
            String riga[]= ris.get(0);
            u.setUsername(riga[3]);
            u.setPassword(riga[5]);
            u.setRuolo(riga[6]);
            return u;
        }
    }

    public boolean findUsername(String username) {
        String query1 = "SELECT username FROM utente WHERE username='"+username+"'";
        ArrayList<String[]> ris1 = DbConnection.getInstance().eseguiQuery(query1);
        if (ris1.isEmpty())
            return false;
        else
            return true;
    }

    public boolean findEmail(String email) {
        String query2 = "SELECT email FROM utente WHERE email='"+email+"'";
        ArrayList<String[]> ris2 = DbConnection.getInstance().eseguiQuery(query2);
        if (ris2.isEmpty())
            return false;
        else
            return true;
    }


}
