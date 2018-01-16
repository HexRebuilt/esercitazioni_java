package interfaccia;

import match.Partita;

import javax.swing.*;

public class CreaInterfaccia {
    private Partita game;

    public CreaInterfaccia(Partita game){
        this.game=game;
    }

    public void apriInterfaccia(){
        MainInterface mainInterface=new MainInterface(game);
        mainInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainInterface.setVisible(true);
    }

}
