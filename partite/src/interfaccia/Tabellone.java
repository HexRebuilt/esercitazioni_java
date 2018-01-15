package interfaccia;

import javax.swing.*;
import java.awt.*;

public class Tabellone extends JPanel {
    public Tabellone( int ptC, int ptO, int setC, int setO, int set, String minuti){
        setLayout(new GridLayout(3,3));

        //todo layout team A, tempo gioco, Team B \n pt A, data match, pt B, time out A, primo/secondo tempo, time out B
        JLabel casa=new JLabel("Casa");
        casa.setAlignmentX(CENTER_ALIGNMENT);casa.setAlignmentY(CENTER_ALIGNMENT);
        JLabel time=new JLabel(minuti);
        time.setAlignmentX(CENTER_ALIGNMENT);time.setAlignmentY(CENTER_ALIGNMENT);
        JLabel ospiti=new JLabel("Ospiti");
        ospiti.setAlignmentX(CENTER_ALIGNMENT);ospiti.setAlignmentY(CENTER_ALIGNMENT);
        add(casa);add(time);add(ospiti);

        JLabel pointsC= new JLabel("Punti:\n\n"+ptC);
        pointsC.setAlignmentX(CENTER_ALIGNMENT);pointsC.setAlignmentY(CENTER_ALIGNMENT);
        JLabel tempo=new JLabel("Tempo/Set:\n"+set);
        tempo.setAlignmentX(CENTER_ALIGNMENT);tempo.setAlignmentY(CENTER_ALIGNMENT);
        JLabel pointsO=new JLabel("Punti:\n\n"+ptO);
        pointsO.setAlignmentX(CENTER_ALIGNMENT);pointsC.setAlignmentY(CENTER_ALIGNMENT);
        add(pointsC);add(tempo);add(pointsO);

        JLabel setVintiC= new JLabel("Set Vinti:\n\n"+setC);
        setVintiC.setAlignmentX(CENTER_ALIGNMENT);setVintiC.setAlignmentY(CENTER_ALIGNMENT);
        JButton update=new JButton("Prossima azione");
        update.setAlignmentX(CENTER_ALIGNMENT);update.setAlignmentY(CENTER_ALIGNMENT);
        JLabel setVintiO=new JLabel("Set Vinti:\n\n"+setO);
        setVintiC.setAlignmentX(CENTER_ALIGNMENT);setVintiC.setAlignmentY(CENTER_ALIGNMENT);
        add(setVintiC);add(update);add(setVintiO);
    }
}
