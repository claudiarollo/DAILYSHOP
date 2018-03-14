package it.unisalento.pps.model;

import it.unisalento.pps.dao.UtenteDAO;

public class Utente {

    private int idUtente;
    private String username;
    private String password;
    private String ruolo;

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }



    public Utente findbyUserPwd(String username, String password) {
        UtenteDAO uDAO = new UtenteDAO();
        return uDAO.findUserByUsernameAndPassword(username, password);
    }

    public boolean findUser(String username){
        UtenteDAO ud = new UtenteDAO();
        return ud.findUsername(username);
    }

    public boolean findEmail(String email){
        UtenteDAO uda = new UtenteDAO();
        return uda.findEmail(email);
    }
}

