package match;

import interfaccia.MainInterface;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public abstract class Partita {
    public String n_casa, n_osp;
    public int tempo,punti_C, punti_O;
    private BufferedReader bufferedReader;
    private FileReader fileReader;
    public Tipi event;
    public ArrayList<String[]> commenti;
    public ArrayList<Integer> codici;
    public int eventoCorrente;

    public Partita(){
        this.n_casa = n_casa;
        this.n_osp = n_osp;
        this.punti_C = 0;
        this.punti_O = 0;
        this.tempo=0;
        this.commenti=null;
        this.codici=new ArrayList<>();
        this.eventoCorrente=0;
    }

    protected void setTempo(){
        tempo++;
    }

    protected void addPuntiC(){
        punti_C++;
    }

    protected void addPuntiO(){
        punti_O++;
    }

    public void getCommentCode(){
        for(int i=0;i<(commenti.size());i++){
            String[] linea= commenti.get(i);
            String[] codice= linea[0].split("-");
            int cod=parseInt(codice[1]);
            codici.add(cod);
        }

    }

    public String getDateEvent(){
        return commenti.get(eventoCorrente)[2];
    }

    public void creaInterfaccia(Partita game) {
        MainInterface interfaccia=new MainInterface(event.toString(),game);
        interfaccia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interfaccia.setVisible(true);

    }

    public void scrollEvent(){
        int i=codici.get(eventoCorrente);
        analizzaCod(i);
        eventoCorrente++;
    }

    public int getTempo() {
        return tempo;
    }

    public int getPunti_O() {
        return punti_O;
    }

    public int getPunti_C() {
        return punti_C;
    }

    public String getTimeEvent(int i){
        return commenti.get(i)[4];
    }

    protected abstract void analizzaCod(int cod);


    public String toString() {
        return ("PT casa: "+getPunti_C()+"\tPt ospiti: "+getPunti_O()+"\ttempo finale: "+getTempo()+"\tin data: "+getDateEvent());
    }

    public abstract int getSet_O();

    public abstract int getSet_C();
}
