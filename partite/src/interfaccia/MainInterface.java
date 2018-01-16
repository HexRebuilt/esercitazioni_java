package interfaccia;

import match.Partita;
import match.Tipi;

import javax.swing.*;
import java.awt.*;

public class MainInterface extends JFrame{
    protected Partita game;

    public MainInterface(Partita game){
        this.game=game;

        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension size=kit.getScreenSize();
        size.setSize(size.width/2,size.height/2);
        Image img=kit.getImage("30588-Mazda-Wankel-Rotary.png");
        setIconImage(img);
        setTitle(game.getEvento());
        setSize(size);
        setLocation(size.width/4,size.height/4);

        JPanel jp=new JPanel(); //aggiungo a lui tutti i pezzi dentro al frame
        jp.setLayout(new GridLayout(2,1));

        Tabellone tabellone=new Tabellone(game.getDatiInterfaccia(),game.commentoCorrente(),game.getDateEvent());
        jp.add(tabellone);


        //alla fine aggiungo tutto al frame
        Container container=getContentPane();
        container.add(jp);
        setVisible(true);

    }




}
