package it.unisalento.pps.view;

import it.unisalento.pps.business.GestoreBusiness;
import it.unisalento.pps.view.ActionListener.*;
import it.unisalento.pps.view.GUI.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Frame extends JFrame {

    // COMPONENTI

    LoginPanel loginPanel = new LoginPanel();
    RegistrazionePanel registrazionePanel = new RegistrazionePanel();
    AmministratorePanel amministratorePanel = new AmministratorePanel();
    GestisciNuoviUtentiPanel gestisciNuoviUtentiPanel = new GestisciNuoviUtentiPanel();
    HomePanel homePanel = new HomePanel();
    NordCatalogoPanel nordCatalogoPanel = new NordCatalogoPanel();
    CatalogoPanel catalogoPanel = new CatalogoPanel();
    GestorePanel gestorePanel = new GestorePanel();



    //Pannelli che saranno presenti nel frame principale
    JPanel rootPnl = new JPanel();
    JPanel nordPnl = new JPanel();
    JPanel centroPnl = new JPanel();
    JPanel sudPnl = new JPanel();


    JFrame view = new JFrame();      //dichiarazione del nostro frame unico


    public Frame() {
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setPreferredSize(new Dimension(1200, 750));
        view.setLocation(115, 25);
            rootPnl.setLayout(new BorderLayout());
            rootPnl.add(nordPnl, BorderLayout.NORTH);
            rootPnl.add(centroPnl, BorderLayout.CENTER);
            rootPnl.add(sudPnl, BorderLayout.SOUTH);


            nordPnl.add(homePanel.getHomePanel());
            nordPnl.add(nordCatalogoPanel.getNordCatalogoPnl());

            centroPnl.add(loginPanel.getLoginPanel());
            centroPnl.add(registrazionePanel.getRegistrazionePanel());
            centroPnl.add(amministratorePanel.getAmministratorePanel());
            centroPnl.add(gestisciNuoviUtentiPanel.getGestisciNuoviUtentiPanel());
            centroPnl.add(catalogoPanel.getCatalogoPnl());
            centroPnl.add(gestorePanel.getGestorePanel());


        view.setContentPane(rootPnl);
        view.setVisible(true);
        view.pack();




        //ACTION LISTENERS



        HomeListener homeListener = new HomeListener(this);

        homePanel.getLoginBtn().addActionListener(homeListener);
        homePanel.getLoginBtn().setActionCommand(HomeListener.LOGIN_BTN_HOME);
        homePanel.getRegistratiBtn().addActionListener(homeListener);
        homePanel.getRegistratiBtn().setActionCommand(HomeListener.REGISTRATI_BTN_HOME);
        homePanel.getVISUALIZZAILCATALOGOButton().addActionListener(homeListener);
        homePanel.getVISUALIZZAILCATALOGOButton().setActionCommand(HomeListener.VEDICATALOGO);


        LoginListener loginlistener = new LoginListener(this);

        loginPanel.getLoginBtn().addActionListener(loginlistener);
        loginPanel.getLoginBtn().setActionCommand(LoginListener.LOGIN);
        loginPanel.getIndietroBtn().addActionListener(loginlistener);
        loginPanel.getIndietroBtn().setActionCommand(LoginListener.INDIETRO_DA_LOGIN);



        RegistrazioneListener registrazionelistener = new RegistrazioneListener(this);

        registrazionePanel.getRegistratiBtn().addActionListener(registrazionelistener);
        registrazionePanel.getRegistratiBtn().setActionCommand(RegistrazioneListener.CONFERMA_BTN);
        registrazionePanel.getIndietroBtn().addActionListener(registrazionelistener);
        registrazionePanel.getIndietroBtn().setActionCommand(RegistrazioneListener.INDIETRO_DA_REGISTRAZIONE);


        AmministratoreListener amministratoreListener = new AmministratoreListener(this);

        amministratorePanel.getGestisciUtentiBtn().addActionListener(amministratoreListener);
        amministratorePanel.getGestisciUtentiBtn().setActionCommand(AmministratoreListener.GESTISCINUOVIUTENTI);
        amministratorePanel.getLogoutBtn().addActionListener(amministratoreListener);
        amministratorePanel.getLogoutBtn().setActionCommand(AmministratoreListener.LOGOUT);

        gestisciNuoviUtentiPanel.getConfermaUtenteBtn().addActionListener(amministratoreListener);
        gestisciNuoviUtentiPanel.getConfermaUtenteBtn().setActionCommand(AmministratoreListener.CONFERMAUTENTE);
        gestisciNuoviUtentiPanel.getConfermaTuttiBtn().addActionListener(amministratoreListener);
        gestisciNuoviUtentiPanel.getConfermaTuttiBtn().setActionCommand(AmministratoreListener.CONFERMATUTTI);
        gestisciNuoviUtentiPanel.getRifiutaUtenteBtn().addActionListener(amministratoreListener);
        gestisciNuoviUtentiPanel.getRifiutaUtenteBtn().setActionCommand(AmministratoreListener.RIFIUTAUTENTE);
        gestisciNuoviUtentiPanel.getRifiutaTuttiBtn().addActionListener(amministratoreListener);
        gestisciNuoviUtentiPanel.getRifiutaTuttiBtn().setActionCommand(AmministratoreListener.RIFIUTATUTTI);
        gestisciNuoviUtentiPanel.getIndietroBtn().addActionListener(amministratoreListener);
        gestisciNuoviUtentiPanel.getIndietroBtn().setActionCommand(AmministratoreListener.INDIETRO_DA_GESTISCINUOVIUTENTI);


        CatalogoListener catalogoListener = new CatalogoListener(this);

        nordCatalogoPanel.getVisualizzaTuttiBtn().addActionListener(catalogoListener);
        nordCatalogoPanel.getVisualizzaTuttiBtn().setActionCommand(CatalogoListener.VISUALIZZATUTTI);
        nordCatalogoPanel.getCategoriaBtn().addActionListener(catalogoListener);
        nordCatalogoPanel.getCategoriaBtn().setActionCommand(CatalogoListener.PER_CATEGORIA);
        nordCatalogoPanel.getFasciaPrezzoBtn().addActionListener(catalogoListener);
        nordCatalogoPanel.getFasciaPrezzoBtn().setActionCommand(CatalogoListener.PER_FASCIA);
        nordCatalogoPanel.getRepartoBtn().addActionListener(catalogoListener);
        nordCatalogoPanel.getRepartoBtn().setActionCommand(CatalogoListener.PER_REPARTO);

        catalogoPanel.getBackhomeBtn().addActionListener(catalogoListener);
        catalogoPanel.getBackhomeBtn().setActionCommand(CatalogoListener.GO_BACK_HOME);


        ComboBoxListener comboBoxListener = new ComboBoxListener(this);

        nordCatalogoPanel.getCategorieCBox().addItemListener(comboBoxListener);
        nordCatalogoPanel.getRepartiCBox().addItemListener(comboBoxListener);
        nordCatalogoPanel.getFasceCBox().addItemListener(comboBoxListener);


        GestoreListener gestoreListener = new GestoreListener(this);

        getGestorePanel().getAggiungiProdottoBtn().addActionListener(gestoreListener);
        getGestorePanel().getAggiungiProdottoBtn().setActionCommand(GestoreListener.AGGIUNGI_PRODOTTO);
        getGestorePanel().getEliminaProdottoBtn().addActionListener(gestoreListener);
        getGestorePanel().getEliminaProdottoBtn().setActionCommand(GestoreListener.ELIMINA_PRODOTTO);
        getGestorePanel().getRefreshBtn().addActionListener(gestoreListener);
        getGestorePanel().getRefreshBtn().setActionCommand(GestoreListener.REFRESH_BTN);
        getGestorePanel().getLogoutBtn().addActionListener(gestoreListener);
        getGestorePanel().getLogoutBtn().setActionCommand(GestoreListener.LOGOUT);


    }


    public LoginPanel getLoginPanel() {
        return loginPanel;
    }

    public RegistrazionePanel getRegistrazionePanel() {
        return registrazionePanel;
    }

    public AmministratorePanel getAmministratorePanel() {
        return amministratorePanel;
    }

    public GestisciNuoviUtentiPanel getGestisciNuoviUtentiPanel() {
        return gestisciNuoviUtentiPanel;
    }

    public HomePanel getHomePanel() {
        return homePanel;
    }

    public NordCatalogoPanel getNordCatalogoPanel() {
        return nordCatalogoPanel;
    }

    public CatalogoPanel getCatalogoPanel() {
        return catalogoPanel;
    }

    public GestorePanel getGestorePanel() {
        return gestorePanel;
    }
}
