package interfaccia;

import match.Partita;

import javax.swing.*;
import java.awt.*;

public class MainInterface extends JFrame{

    public MainInterface(String tipoEvento){
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension size=kit.getScreenSize();
        size.setSize(size.width/2,size.height/2);
        Image img=kit.getImage("30588-Mazda-Wankel-Rotary.png");
        setIconImage(img);
        setTitle(tipoEvento);
        setSize(size);
        setLocation(size.width/4,size.height/4);



    }




}
