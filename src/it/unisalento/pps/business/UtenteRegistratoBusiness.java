package it.unisalento.pps.business;

import it.unisalento.pps.model.UtenteRegistrato;

import java.util.ArrayList;

public class UtenteRegistratoBusiness {

    //singleton pattern
    private static UtenteRegistratoBusiness instance;

    public static UtenteRegistratoBusiness getInstance() {
        if(instance == null)
            instance = new UtenteRegistratoBusiness();
        return instance;
    }


    //per registrarsi
    public boolean effettuaRegistrazione(String nome, String cognome, String username, String email, String password){

        UtenteRegistrato u = new UtenteRegistrato();
        u.setNome(nome);
        u.setCognome(cognome);
        u.setUsername(username);
        u.setEmail(email);
        u.setPassword(password);
        u.registrazione(u);
        return true;
    }


    //per vedere elenco dei nuovi utenti dall'admin
    public ArrayList<UtenteRegistrato> elencoNewUtenti() {
        UtenteRegistrato ut = new UtenteRegistrato();
        return ut.findNuoviUtenti();
    }
}
