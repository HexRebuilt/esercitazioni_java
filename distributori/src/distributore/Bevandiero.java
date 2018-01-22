package distributore;

import distributore.Elementi.Bevande;

import java.util.ArrayList;

import static java.lang.Double.parseDouble;

public class Bevandiero extends Distributore {

    private ArrayList<Double> grammi;

    public Bevandiero(ArrayList<String[]> file) {
        super(file);
        this.grammi=new ArrayList<>();
    }

    protected void creaLista() {
        for (int i = 0; i < file.size(); i++) {
            grammi = new ArrayList<>();
            String[] splittata = file.get(i);
            Bevande bevanda=new Bevande(splittata[0], parseDouble(splittata[1]), splittata[2], parseDouble(splittata[3]));
            elementi.add(bevanda);
            grammi.add(500.00);
        }
    }

    @Override
    protected void refill(int index) {
        grammi.set(index,500.00);
    }

    @Override
    protected boolean disponibile(int index) {
        if(grammi.get(index)<=elementi.get(index).getGrammi()){
            return true;
        }
        else {
            return false;
        }
    }
}
