package it.unisalento.pps.business;

import it.unisalento.pps.model.UtenteRegistrato;

public class AmministratoreBusiness {

    //singleton pattern
    private static AmministratoreBusiness instance;

    public static AmministratoreBusiness getInstance() {
        if(instance == null)
            instance = new AmministratoreBusiness();
        return instance;
    }


    //per confermare la richiesta di un nuovo utente
    public boolean confermaNewUser(String user){
        UtenteRegistrato ute = new UtenteRegistrato();
        boolean conferma = ute.confermaUser(user);
        if (conferma == true)
            return true;
        else
            return false;
    }

    public boolean confermaTuttiGliUtenti(){
        UtenteRegistrato utenteregi = new UtenteRegistrato();
        boolean conferma = utenteregi.confermatutti();
        if(conferma == true)
            return true;
        else
            return false;
    }

    public boolean rifiutaNewUser(String user){
        UtenteRegistrato uto = new UtenteRegistrato();
        boolean conferma = uto.rifiutaUser(user);
        if (conferma == true)
            return true;
        else
            return false;
    }

    public boolean rifiutaTuttiGliUtenti(){
        UtenteRegistrato registrato = new UtenteRegistrato();
        boolean conferma = registrato.rifiutatutti();
        if (conferma == true)
            return true;
        else
            return false;
    }
}
