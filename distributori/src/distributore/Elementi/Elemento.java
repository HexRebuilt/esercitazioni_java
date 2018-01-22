package distributore.Elementi;

public abstract class Elemento {
    public String codice;
    public String nome;
    public double costo;
    private double grammi;

    public Elemento(String codice, String nome, double costo) {
        this.codice = codice;
        this.nome = nome;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return ( nome + '\t' + costo +"€");
    }

    public double getGrammi() {
        return grammi;
    }
}

