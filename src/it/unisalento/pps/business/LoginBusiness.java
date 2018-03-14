package it.unisalento.pps.business;

import it.unisalento.pps.dao.UtenteDAO;
import it.unisalento.pps.model.Utente;

public class LoginBusiness {

    //singleton pattern
    private static LoginBusiness instance;

    public static LoginBusiness getInstance() {
        if(instance == null)
            instance = new LoginBusiness();
        return instance;
    }


    public Utente effettuaLogin(String username, String password) {
        Utente u = new Utente();
        u.setUsername(username);
        u.setPassword(password);
        if (u.findbyUserPwd(username, password) != null) {
            u.setRuolo(u.findbyUserPwd(username, password).getRuolo());
            return u;
        } else {
            return null;
        }
    }


}
