package distributore.Elementi;

public abstract class Elemento {
    public String codice;
    public String nome;
    public double costo;
    public int qta;
    //public int grammi;

    public Elemento(String codice, String nome, double costo) {
        this.codice = codice;
        this.nome = nome;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return ( codice+"\t"+nome + '\t' + costo +"€");
    }

}

