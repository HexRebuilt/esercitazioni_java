package Agenda;

public class Appuntamenti {
    private String[] paziente;
    private String patologia;
    private int giorno;

    public Appuntamenti(String cognome,String nome, String patologia) {
        this.paziente[0] = cognome;
        this.paziente[1] = nome;
        this.patologia = patologia;
    }

    public Appuntamenti(String cognome,String nome, String patologia, int giorno) {
        this.paziente[0] = cognome;
        this.paziente[1] = nome;
        this.giorno = giorno;
    }

    public String[] getPaziente() {
        return paziente;
    }

    public String getPatologia() {
        return patologia;
    }

    public int getGiorno() {
        return giorno;
    }
}
