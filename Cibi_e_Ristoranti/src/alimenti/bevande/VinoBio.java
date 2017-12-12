package alimenti.bevande;

import alimenti.Biologico;
import alimenti.bevande.Vino;

public class VinoBio extends Vino implements Biologico {

    public VinoBio(String nome,String tipo, String colore, double gradazione) {
        super(nome, gradazione, tipo, colore);
    }

    @Override
    public String toString() {
        return super.toString()+" e' biologico";
    }

    public boolean isBio() {
        return true;
    }
}
