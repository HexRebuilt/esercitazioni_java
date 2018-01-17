package interfaccia;

import match.Partita;
import match.Risultato;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInterface extends JFrame{
    protected Partita game;
    protected JPanel jp;

    public MainInterface(Partita game){
        this.game=game;
        this.jp=new JPanel();

        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension size=kit.getScreenSize();
        size.setSize(size.width/2,size.height/2);
        Image img=kit.getImage("30588-Mazda-Wankel-Rotary.png");
        setIconImage(img);
        setTitle(game.getEvento());
        setSize(size);
        setLocation(size.width/4,size.height/4);

        //JPanel jp=new JPanel(); //aggiungo a lui tutti i pezzi dentro al frame
        jp.setLayout(new BorderLayout());

        Tabellone tabellone=new Tabellone(game);
        jp.add(tabellone);

        //alla fine aggiungo tutto al frame
        Container container=getContentPane();
        container.add(jp);
        setDefaultCloseOperation(game.getFinepartita());
        setVisible(true);

    }

    public class Tabellone extends JPanel {
        public Tabellone(Partita game) {
            setLayout(new GridLayout(4, 3));

            //todo layout team A, tempo gioco, Team B \n pt A, data match, pt B, time out A, primo/secondo tempo, time out B
            JLabel casa = new JLabel("Casa");
            JLabel time = new JLabel(game.getTimeEvent());
            JLabel ospiti = new JLabel("Ospiti");
            add(casa);
            add(time);
            add(ospiti);

            JLabel pointsC = new JLabel("Punti :" );
            JLabel tempo = new JLabel("Tempo/Set :" );
            JLabel pointsO = new JLabel("Punti  :");
            add(pointsC);
            add(tempo);
            add(pointsO);

            JLabel commenti = new JLabel(game.commentoCorrente());
            JLabel setVintiC = new JLabel("Set Vinti  :");
            JLabel setVintiO = new JLabel("Set Vinti  :");
            add(setVintiC);
            add(commenti);
            add(setVintiO);

            JLabel timeOutC = new JLabel("Timeout  : ");
            JButton update = new JButton("Prossima azione");
            JLabel timeOutO = new JLabel("Timeout  : ");
            add(timeOutC);
            add(update);
            add(timeOutO);
            update.addActionListener(aggiorna ->{
                game.scrollEvent();

                time.setText(game.getTimeEvent());

                pointsC.setText("Punti  :" + game.getRisultato().getPtc());
                tempo.setText("Tempo/Set  :" + game.getRisultato().getTempo());
                pointsO.setText("Punti  :" + game.getRisultato().getPto());

                setVintiC.setText("Set Vinti  :" + game.getRisultato().getSetc());
                setVintiO.setText("Set Vinti  :" + game.getRisultato().getSeto());

                timeOutC.setText("Timeout  : " + game.getRisultato().getToutc());
                timeOutO.setText("Timeout  : " + game.getRisultato().getTouto());
                commenti.setText(game.commentoCorrente());
            });
        }
    }
}
