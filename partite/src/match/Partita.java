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
    public int eventoCorrente;
    protected int[] datiInterfaccia;

    public Partita(){
        this.n_casa = n_casa;
        this.n_osp = n_osp;
        this.punti_C = 0;
        this.punti_O = 0;
        this.tempo=0;
        this.commenti=null;
        this.codici=new ArrayList<>();
        this.eventoCorrente=0;
        this.datiInterfaccia=null;
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


    /*
    public void creaInterfaccia(Partita game) {
        MainInterface interfaccia=new MainInterface(event.toString(),game);
        interfaccia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interfaccia.setVisible(true);

    }
    */
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
        return commenti.get(i)[3];
    }

    public String getEvento() {
        if (event== Tipi.CALCIO){
            return "Partita di calcio";
        }
        else {
            return "Partita di pallavvolo";
        }
    }

    public int[] getDatiInterfaccia(){
        datiInterfaccia[0]=getPunti_C();
        datiInterfaccia[1]=getPunti_O();
        datiInterfaccia[2]=getSet_C();
        datiInterfaccia[3]=getSet_O();
        datiInterfaccia[4]=getTempo();
        datiInterfaccia[5]=getTout_C();
        datiInterfaccia[6]=getTout_O();
        return datiInterfaccia;
    }

    public String commentoCorrente() {
        return commenti.get(eventoCorrente)[2];
    }

    protected abstract void analizzaCod(int cod);

    public abstract String toString();

    public abstract int getSet_O();

    public abstract int getSet_C();

    public abstract int getTout_C();

    public abstract int getTout_O();
}
