package it.unisalento.pps.view;

import it.unisalento.pps.view.GUI.AmministratoreFrame;
import it.unisalento.pps.view.GUI.GestisciNuoviUtentiFrame;
import it.unisalento.pps.view.GUI.RegistrazioneFrame;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String args[]){




         //GESTISCI NUOVI UTENTI PANEL
        JFrame frame3 = new JFrame("Richieste di registrazione utenti");
        frame3.setContentPane(new GestisciNuoviUtentiFrame().getMainPnl());
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.pack();
        frame3.setLocationRelativeTo(null);
        frame3.setSize(400,300);
        frame3.setVisible(false);




        // AREA AMMINISTRATORE PANEL
        JFrame frame2 = new JFrame("Area amministratore");
        frame2.setContentPane(new AmministratoreFrame().getMainPnl());
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setLocationRelativeTo(null);
        frame2.setSize(400,300);
        frame2.setVisible(true);




        // EFFETTUA REGISTRAZIONE PANEL
        JFrame frame1 = new JFrame("Registrazione");
        frame1.setContentPane(new RegistrazioneFrame().getMainPnl());
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setLocationRelativeTo(null);
        frame1.setSize(400,300);
        frame1.setVisible(false);




        /* LOGIN PANEL
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new LoginFrame().getMainPnl());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(400,300);
        frame.setVisible(false);
        */



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
