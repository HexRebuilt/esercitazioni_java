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

            JLabel pointsC = new JLabel("Punti:" + game.getRisultato().getRisultato(0));
            JLabel tempo = new JLabel("Tempo/Set:" + game.getRisultato().getRisultato(1));
            JLabel pointsO = new JLabel("Punti:" + game.getRisultato().getRisultato(2));
            add(pointsC);
            add(tempo);
            add(pointsO);

            JLabel commenti = new JLabel(game.commentoCorrente());
            JLabel setVintiC = new JLabel("Set Vinti:" + game.getRisultato().getRisultato(3));
            JLabel setVintiO = new JLabel("Set Vinti:" + game.getRisultato().getRisultato(4));
            add(setVintiC);
            add(commenti);
            add(setVintiO);

            JLabel timeOutC = new JLabel("Timeout: " + game.getRisultato().getRisultato(5));
            JButton update = new JButton("Prossima azione");
            JLabel timeOutO = new JLabel("Timeout: " + game.getRisultato().getRisultato(6));
            add(timeOutC);
            add(update);
            add(timeOutO);
            update.addActionListener(aggiorna ->{
                game.scrollEvent();
                
                time.setText(game.getTimeEvent());

                pointsC.setText("Punti:" + game.getRisultato().getRisultato(0));
                tempo.setText("Tempo/Set:" + game.getRisultato().getRisultato(1));
                pointsO.setText("Punti:" + game.getRisultato().getRisultato(2));

                commenti.setText(game.commentoCorrente());
                setVintiC.setText("Set Vinti:" + game.getRisultato().getRisultato(3));
                setVintiO.setText("Set Vinti:" + game.getRisultato().getRisultato(4));

                timeOutC.setText("Timeout: " + game.getRisultato().getRisultato(5));
                update.setText("Prossima azione");
                timeOutO.setText("Timeout: " + game.getRisultato().getRisultato(6));
            });
        }
    }
}
