package alimenti.cibi;

import alimenti.Alimento;

public class Carne extends Alimento {
    private String animale;
    private String pezzo;

    public Carne(String nome, String animale, String pezzo) {
        super(nome);
        this.animale = animale;
        this.pezzo = pezzo;
    }

    @Override
    public String toString() {
        return super.toString()+"\t Animale: "+animale+"\t Pezzo: "+pezzo;
    }
}
