package interfaccia;

import javax.swing.*;
import java.awt.*;

public class Tabellone extends JPanel {
    public Tabellone(String dateEvent, int ptC, int ptO, int setC, int setO, int set, String minuti){
        setLayout(new GridLayout(3,3));

        //todo layout team A, tempo gioco, Team B \n pt A, data match, pt B, time out A, primo/secondo tempo, time out B
        JLabel casa=new JLabel("Casa");
        JLabel time=new JLabel(minuti);
        JLabel ospiti=new JLabel("Ospiti");
        add(casa);add(time);add(ospiti);

        JLabel pointsC= new JLabel("Punti:\n"+ptC);
        JLabel tempo=new JLabel("Tempo/Set:\n"+set);
        JLabel pointsO=new JLabel("Punti:\n"+ptO);
        add(pointsC);add(tempo);add(pointsO);

        JLabel setVintiC= new JLabel("Set Vinti:\n"+setC);
        JButton update=new JButton();
        JLabel setVintiO=new JLabel("Set Vinti:\n"+setO);
        add(setVintiC);add(update);add(setVintiO);
    }
}
