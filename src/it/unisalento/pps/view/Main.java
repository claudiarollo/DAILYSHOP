package it.unisalento.pps.view;

import it.unisalento.pps.dbinterface.DbConnection;
import it.unisalento.pps.view.GUI.LoginFrame;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        JFrame frame = new JFrame("LoginFrame");
        frame.setContentPane(new LoginFrame().getMainPnl());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);




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
