package it.unisalento.pps.view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    // COMPONENTI
    // ... dichiarazione pannelli LoginPanel, RegistrazionePanel ecc.



    //Pannelli che saranno presenti nel frame principale
    JPanel rootPnl = new JPanel();
    JPanel nordPnl = new JPanel();
    JPanel centroPnl = new JPanel();
    JPanel sudPnl = new JPanel();


    JFrame view = new JFrame();      //dichiarazione del nostro frame unico


    public Frame() {
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setPreferredSize(new Dimension(1300, 750));
        view.setLocation(65, 25);
            rootPnl.setLayout(new BorderLayout());
            rootPnl.add(nordPnl, BorderLayout.NORTH);
            rootPnl.add(centroPnl, BorderLayout.CENTER);
            rootPnl.add(sudPnl, BorderLayout.SOUTH);


        view.setContentPane(rootPnl);
        view.setVisible(true);
        view.pack();




        //ACTION LISTENERS
        // ...

    }

}
