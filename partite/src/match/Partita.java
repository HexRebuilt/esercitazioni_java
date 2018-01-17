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
    protected Risultato risultato;
    protected boolean finepartita;

    public Partita() {
        this.n_casa = n_casa;
        this.n_osp = n_osp;
        this.punti_C = 0;
        this.punti_O = 0;
        this.tempo = 0;
        this.commenti = null;
        this.codici = new ArrayList<>();
        this.eventoCorrente = 0;
        this.risultato = new Risultato();
        this.finepartita=false;
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

    public void scrollEvent(){
        int i=codici.get(eventoCorrente);
            analizzaCod(i);
            eventoCorrente++;
            aggiornaRisultato();
    }

    public int getTempo() {
        return tempo;
    }

    public int getPunti_O() {
        return punti_O;
    }

    public int getFinepartita() {
        if(finepartita){
            return 1;
        }
        else {
            return 0;
        }
    }

    public int getPunti_C() {
        return punti_C;
    }

    public String getTimeEvent(){
        return commenti.get(eventoCorrente)[2];
    }

    public String commentoCorrente() {
        return commenti.get(eventoCorrente)[1];
    }

    protected abstract void analizzaCod(int cod);

    public String getEvento() {
        if (event== Tipi.CALCIO){
            return "Partita di calcio";
        }
        else {
            return "Partita di pallavvolo";
        }
    }

    public void aggiornaRisultato(){
        risultato.setPtc(getPunti_C());
        risultato.setPto(getPunti_O());
        risultato.setSetc(getSet_C());
        risultato.setSeto(getSet_O());
        risultato.setTempo(getTempo());
        risultato.setToutc(getTout_C());
        risultato.setTouto(getTout_O());
    }

    public Risultato getRisultato() {
        return risultato;
    }


    public abstract String toString();

    public abstract int getSet_O();

    public abstract int getSet_C();

    public abstract int getTout_C();

    public abstract int getTout_O();
}
