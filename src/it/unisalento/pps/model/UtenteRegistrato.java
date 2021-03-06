package it.unisalento.pps.model;

import it.unisalento.pps.dao.UtenteRegistratoDAO;

import java.util.ArrayList;

public class UtenteRegistrato extends Utente {

    private String nome;
    private String cognome;
    private String username;
    private String email;
    private String password;
    private String indirizzo;
    private String città;
    private String provincia;
    private String cap;
    private String recapito;
    private String codicecarta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getRecapito() {
        return recapito;
    }

    public void setRecapito(String recapito) {
        this.recapito = recapito;
    }

    public String getCodicecarta() {
        return codicecarta;
    }

    public void setCodicecarta(String codicecarta) {
        this.codicecarta = codicecarta;
    }

    //

    // effettua registrazione
    public boolean registrazione(UtenteRegistrato registrato) {

        UtenteRegistratoDAO utDAO = new UtenteRegistratoDAO();
        return utDAO.registrazione(registrato);
    }

    //per avere elenco dei nuovi utenti
    public ArrayList<UtenteRegistrato> findNuoviUtenti() {
        UtenteRegistratoDAO urdao = new UtenteRegistratoDAO();
        return urdao.elencoNuoviUtenti();
    }

    //per confermare un nuovo utente dall'admin
    public boolean confermaUser(String username){
        UtenteRegistratoDAO regdao = new UtenteRegistratoDAO();
        return regdao.confermaUtente(username);
    }

    //conferma tutti
    public boolean confermatutti(){
        UtenteRegistratoDAO todao = new UtenteRegistratoDAO();
        return todao.confermaTutti();
    }

    //rifiuta un utente
    public boolean rifiutaUser(String username){
        UtenteRegistratoDAO udao = new UtenteRegistratoDAO();
        return udao.rifiutaUtente(username);
    }

    //rifiuta tutti i nuovi utenti
    public boolean rifiutatutti(){
        UtenteRegistratoDAO uregidao = new UtenteRegistratoDAO();
        return uregidao.rifiutaTutti();
    }
}
