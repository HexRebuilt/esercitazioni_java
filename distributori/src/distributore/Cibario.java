package distributore;

import distributore.Elementi.Snack;

import java.util.ArrayList;

import static java.lang.Double.parseDouble;

public class Cibario extends Distributore {

    private ArrayList<Integer> numElementi;

    public Cibario(ArrayList<String[]> file) {
        super(file);
        this.numElementi = new ArrayList<>();
    }

    protected void creaLista() {
        numElementi = new ArrayList<>();
        for (int i = 0; i < file.size(); i++) {
            String[] splittata = file.get(i);
            elementi.add(new Snack(splittata[0], splittata[1], parseDouble(splittata[2])));
            numElementi.add(20);
        }
    }

    @Override
    protected void refill(int index) {
        numElementi.set(index, 20);

    }

    @Override
    protected boolean disponibile(int index) {
        if (numElementi.get(index)>0){
            return true;
        }
        else {
            return false;
        }
    }
}
