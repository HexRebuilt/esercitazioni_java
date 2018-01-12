package match;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public abstract class partita {
    public String evento;
    public String n_casa, n_osp;
    public int punti_C, punti_O;
    private BufferedReader bufferedReader;
    private FileReader fileReader;


    public partita(String file){
        this.evento = evento;
        this.n_casa = n_casa;
        this.n_osp = n_osp;
        this.punti_C = 0;
        this.punti_O = 0;

        try {
            this.fileReader=new FileReader(file);
        } catch (FileNotFoundException e) {
            //TODO eccezione da modificare
            e.printStackTrace();
        }
        this.bufferedReader=new BufferedReader(fileReader);
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getN_casa() {
        return n_casa;
    }

    public void setN_casa(String n_casa) {
        this.n_casa = n_casa;
    }

    public String getN_osp() {
        return n_osp;
    }

    public void setN_osp(String n_osp) {
        this.n_osp = n_osp;
    }

    public int getPunti_C() {
        return punti_C;
    }


    public int getPunti_O() {
        return punti_O;
    }


    public void addPunti(String squadra){
        if(squadra.equals(n_casa)){
            punti_C++;
        }
        else {
            punti_O++;
        }
    }


}
