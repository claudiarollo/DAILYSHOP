package it.unisalento.pps.model;

import it.unisalento.pps.dao.ProdottoDAO;

import java.util.ArrayList;

public class Prodotto {

    int idprodotto;
    String nome;
    String foto;
    String descrizione;
    String prezzo;
    String sconto;
    String produttore;
    String distributore;
    String categoria;
    String fascia;
    String reparto;


    public int getIdprodotto() {
        return idprodotto;
    }

    public void setIdprodotto(int idprodotto) {
        this.idprodotto = idprodotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public String getSconto() {
        return sconto;
    }

    public void setSconto(String sconto) {
        this.sconto = sconto;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getDistributore() {
        return distributore;
    }

    public void setDistributore(String distributore) {
        this.distributore = distributore;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFascia() {
        return fascia;
    }

    public void setFascia(String fascia) {
        this.fascia = fascia;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }


    // per riempire la JList del catalogo con il nome dei prodotti
    public ArrayList<Prodotto> elencoNomeProducts(){
        ProdottoDAO pdao = new ProdottoDAO();
        return pdao.elencoNomiProdotti();
    }


    public ArrayList<Prodotto> findListByCategoria(String categoria){
        ProdottoDAO pdao = new ProdottoDAO();
        return pdao.findElencoByCategoria(categoria);
    }


    public ArrayList<Prodotto> findListByFascia(String fascia){
        ProdottoDAO pdao = new ProdottoDAO();
        return pdao.findElencoByFascia(fascia);
    }


    public ArrayList<Prodotto> findListByReparto(String reparto){
        ProdottoDAO pdao = new ProdottoDAO();
        return  pdao.findElencoByReparto(reparto);
    }


    // per riempire la scheda prodotto con le info
    public Prodotto findInfo(String nome){
        ProdottoDAO pdao = new ProdottoDAO();
        return pdao.findInfoByNomeProdotto(nome);
    }
}
