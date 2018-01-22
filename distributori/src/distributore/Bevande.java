package distributore;

import java.util.ArrayList;

public class Bevande extends Elemento{
    private double grammi;
    public Bevande(String codice, double grammi,String nome, double costo) {
        super(codice, nome, costo);
        this.grammi=grammi;
    }
}
