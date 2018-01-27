package Agenda;

public class Appuntamenti {
    private String[] paziente;
    private String struttura;
    private int giorno;
    private int data, ora;

    public Appuntamenti(String cognome, String nome, String struttura) {
        this.paziente = new String[]{cognome, nome};
        this.struttura = struttura;
        this.data=0;
        this.ora=0;

    }

    public Appuntamenti(String cognome,String nome, String struttura, int giorno) {
        this.paziente = new String[]{cognome,nome};
        this.struttura = struttura;
        this.giorno = giorno;
        this.data=0;
        this.ora=0;
    }

    public String[] getPaziente() {
        return paziente;
    }

    public String getStruttura() {
        return struttura;
    }

    public int getGiorno() {
        return giorno;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public int getOra() {
        return ora;
    }
}
