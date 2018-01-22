package distributore;

public abstract class Elemento {
    private String codice;
    public String nome;
    public double costo;

    public Elemento( String codice, String nome, double costo) {
        this.codice=codice;
        this.nome = nome;
        this.costo = costo;
    }


}
