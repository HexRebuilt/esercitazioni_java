package interfaccia;

import match.Partita;
import match.Risultato;
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
        jp.setLayout(new BorderLayout());

        Tabellone tabellone=new Tabellone(game.getDatiInterfaccia(),game.getTimeEvent(),game.commentoCorrente());
        jp.add(tabellone);

        //alla fine aggiungo tutto al frame
        Container container=getContentPane();
        container.add(jp);
        setVisible(true);

    }

    public class Tabellone extends JPanel {
        public Tabellone(Risultato status, String minuti, String commento){
            setLayout(new GridLayout(4,3));

            //todo layout team A, tempo gioco, Team B \n pt A, data match, pt B, time out A, primo/secondo tempo, time out B
            JLabel casa=new JLabel("Casa");
            JLabel time=new JLabel(minuti);
            JLabel ospiti=new JLabel("Ospiti");
            add(casa);add(time);add(ospiti);

            JLabel pointsC= new JLabel("Punti:"+status.getRisultato(0));
            JLabel tempo=new JLabel("Tempo/Set:"+status.getRisultato(1));
            JLabel pointsO=new JLabel("Punti:"+status.getRisultato(2));
            add(pointsC);add(tempo);add(pointsO);

            JLabel setVintiC= new JLabel("Set Vinti:"+status.getRisultato(3));
            JLabel commenti=new JLabel(commento);
            JLabel setVintiO=new JLabel("Set Vinti:"+status.getRisultato(4));
            add(setVintiC);add(commenti);add(setVintiO);

            JLabel timeOutC=new JLabel("Timeout: "+status.getRisultato(5));
            JButton update=new JButton("Prossima azione");
            JLabel timeOutO=new JLabel("Timeout: "+status.getRisultato(6));
            add(timeOutC);add(update);add(timeOutO);
        }




}
