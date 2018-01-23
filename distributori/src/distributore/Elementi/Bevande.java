package distributore.Elementi;

public class Bevande extends Elemento {
    public int grammi;

    public Bevande(String codice, int necessario, String nome, double costo) {
        super(codice, nome, costo);
        this.grammi = necessario;
        this.qta = 500;
    }
}
