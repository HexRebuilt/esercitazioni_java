package distributore;

import distributore.Elementi.Bevande;

import java.util.ArrayList;

import static java.lang.Double.parseDouble;

public class Bevandiero extends Distributore {

    private double[] grammi;

    public Bevandiero(ArrayList<String[]> file) {
        super(file);
    }

    protected void creaLista() {
        grammi=new double[file.size()];
        for (int i = 0; i < file.size(); i++) {
            String[] splittata = file.get(i);
            Bevande bevanda=new Bevande(splittata[0], parseDouble(splittata[1]), splittata[2], parseDouble(splittata[3]));
            elementi.add(bevanda);
            grammi[i]=500.00;
        }
    }

    @Override
    protected void togliElemento(int index) {
        grammi[index]=grammi[index]-elementi.get(index).getGrammi();
    }

    @Override
    protected void refill(int index) {
        grammi[index]=500.00;
    }

    @Override
    protected boolean disponibile(int index) {
        if(grammi[index]<=elementi.get(index).getGrammi()){
            return true;
        }
        else {
            return false;
        }
    }
}
