package interfaccia;

import match.Partita;

import javax.swing.*;
import java.awt.*;

public class MainInterface extends JFrame{

    public MainInterface(String tipoEvento,Partita game){
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension size=kit.getScreenSize();
        size.setSize(size.width/2,size.height/2);
        Image img=kit.getImage("30588-Mazda-Wankel-Rotary.png");
        setIconImage(img);
        setTitle(tipoEvento);
        setSize(size);
        setLocation(size.width/4,size.height/4);

        JPanel jp=new JPanel(); //aggiungo a lui tutti i pezzi dentro al frame
        jp.setLayout(new GridLayout(2,1));

        Tabellone tabellone=new Tabellone(game.punti_C,game.punti_O,game.getSet_C(),game.getSet_O(),game.getTempo(),game.getDateEvent());
        jp.add(tabellone);

        //aggiungo i commenti
        int now= game.eventoCorrente;
        Commenti commenti=new Commenti(game.commenti.get(now)[2]);
        jp.add(commenti);

        //alla fine aggiungo tutto al frame
        Container container=getContentPane();
        container.add(jp);
        setVisible(true);

    }




}
