package it.unisalento.pps.view;

import javax.swing.*;
import it.unisalento.pps.view.Frame;

public class Main {

    public static void main(String args[]){

        Frame frame = new Frame();






// ------------- CONTROLLO CONNESSIONE DATABASE -----------------------------

        /*
        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM utente");

        //System.out.println("Numero di righe: " + risultato.size());

        for(int i=0;i<risultato.size();i++) {
            String[] riga = risultato.get(i);
            System.out.println("USERNAME: " +riga[3]);
            System.out.println("EMAIL: " +riga[4]);
            System.out.println("--------------------");
        }
        */


    }
}
