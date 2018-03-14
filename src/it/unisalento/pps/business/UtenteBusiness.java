package it.unisalento.pps.business;

import it.unisalento.pps.model.Utente;

public class UtenteBusiness {

    //singleton pattern
    private static UtenteBusiness instance;

    public static UtenteBusiness getInstance() {
        if(instance == null)
            instance = new UtenteBusiness();
        return instance;
    }

    public boolean controllaUsername(String username){
        Utente u = new Utente();
        boolean ris = u.findUser(username);
        if(ris == true)
            return true;
        else
            return false;
    }

    public boolean controllaEmail(String email){
        Utente ut = new Utente();
        boolean result = ut.findEmail(email);
        if (result==true)
            return true;
        else
            return false;
    }
}
