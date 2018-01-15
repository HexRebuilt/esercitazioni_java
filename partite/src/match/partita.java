package match;

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

    public Partita(){
        this.n_casa = n_casa;
        this.n_osp = n_osp;
        this.punti_C = 0;
        this.punti_O = 0;
        this.tempo=0;
        this.commenti=null;
        this.codici=new ArrayList<>();
    }

    public void setTempo(){
        tempo++;
    }

    public Tipi getEvent() {
        return event;
    }


    public int getPunti_C() {
        return punti_C;
    }

    public int getPunti_O() {
        return punti_O;
    }

    public void addPuntiC(){
        punti_C++;
    }

    public void addPuntiO(){
        punti_O++;
    }

    public void getCommentCode(){
        for(int i=0;i<(commenti.size());i++){
            String[] linea= commenti.get(i);
            String[] codice= linea[0].split("-");
            int cod=parseInt(codice[1]);
            codici.add(cod);
            //System.out.print(codici.get(i) +"\t");
        }

    }

    public String getTimeEvent(int i){
        return commenti.get(i)[4];
    }

    public String getDateEvent(int i){
        return commenti.get(i)[3];
    }

}
