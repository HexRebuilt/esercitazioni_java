package alimenti.bevande;

import alimenti.Alimento;

public class Vino extends Alimento{
    private String tipo;
    private String colore;
    private double gradazione;

    public Vino(String nome, double gradazione, String tipo, String colore) {
        super(nome);
        this.tipo = tipo;
        this.colore = colore;
        this.gradazione = gradazione;
    }

    @Override
    public String toString() {
        return super.toString()+"\t Tipo: "+tipo+"\t Colore: "+colore+"\t Gradazione: "+gradazione;
    }
}
