package distributore;

import distributore.Elementi.Elemento;
import distributore.Elementi.Snack;

import java.util.ArrayList;

import static java.lang.Double.parseDouble;

public class Cibario extends Distributore {


    public Cibario(ArrayList<String[]> file) {
        super(file);
    }

    protected void creaLista() {
        for (int i = 0; i < file.size(); i++) {
            String[] splittata = file.get(i);
            elementi.add(new Snack(splittata[0], splittata[1], parseDouble(splittata[2])));
        }
    }

    @Override
    protected void togliElemento(int index) {
        Elemento temp=elementi.get(index);
        temp.qta=elementi.get(index).qta-1;
        elementi.set(index,temp);
    }

    @Override
    protected void refill(int index) {
        Elemento temp=elementi.get(index);
        temp.qta=20;
        elementi.set(index,temp);
    }

    @Override
    protected boolean disponibile(int index) {
        if (elementi.get(index).qta>0){
            return true;
        }
        else {
            return false;
        }
    }
}
