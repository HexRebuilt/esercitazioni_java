package distributore;

import distributore.Elementi.Snack;

import java.util.ArrayList;

import static java.lang.Double.parseDouble;

public class Cibario extends Distributore {

    private int[] numElementi;

    public Cibario(ArrayList<String[]> file) {
        super(file);
    }

    protected void creaLista() {
        numElementi=new int[file.size()];
        for (int i = 0; i < file.size(); i++) {
            String[] splittata = file.get(i);
            elementi.add(new Snack(splittata[0], splittata[1], parseDouble(splittata[2])));
            numElementi[i]=20;
        }
    }

    @Override
    protected void togliElemento(int index) {
        numElementi[index]--;
    }

    @Override
    protected void refill(int index) {
        numElementi[index]=20;

    }

    @Override
    protected boolean disponibile(int index) {
        if (numElementi[index]>0){
            return true;
        }
        else {
            return false;
        }
    }
}
