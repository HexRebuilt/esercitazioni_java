package distributore;

import distributore.Elementi.Bevande;
import distributore.Elementi.Elemento;

import java.util.ArrayList;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Bevandiero extends Distributore {


    public Bevandiero(ArrayList<String[]> file) {
        super(file);
    }

    protected void creaLista() {
         for (int i = 0; i < file.size(); i++) {
            String[] splittata = file.get(i);
            Bevande bevanda=new Bevande(splittata[0], parseInt(splittata[1]), splittata[2], parseDouble(splittata[3]));
            elementi.add(bevanda);
         }
    }

    @Override
    protected void togliElemento(int index) {
        Bevande temp= (Bevande) elementi.get(index);
        temp.qta=elementi.get(index).qta-((Bevande) elementi.get(index)).grammi;
        elementi.set(index,temp);
    }

    @Override
    protected void refill(int index) {
        Elemento temp=elementi.get(index);
        temp.qta=500;
        elementi.set(index,temp);
    }

    @Override
    protected boolean disponibile(int index) {
        if(elementi.get(index).qta>=((Bevande) elementi.get(index)).grammi){
            return true;
        }
        else {
            return false;
        }
    }
}
