package distributore;
import distributore.Elementi.Elemento;

import java.util.ArrayList;

public abstract class Distributore {
    protected ArrayList<String[]> file;
    protected ArrayList<Elemento> elementi;
    private double moneteTot;

    public Distributore(ArrayList<String[]> file) {
        this.elementi = new ArrayList<>();
        this.file = file;
        creaLista();
        this.moneteTot = 0;
    }

    protected abstract void creaLista();

    protected abstract void refill(int index);

    public void printLista() {
        for (int i = 0; i < elementi.size(); i++) {
            mostraElemento(i);
        }
    }

    private void mostraElemento(int index) {
        System.out.println(elementi.get(index).toString());
    }

    public ArrayList<Elemento> getElementi() {
        return elementi;
    }

    public void inserisciMonete() {


    }

    private boolean checkCosto(double monete, int index) {
        if (monete >= elementi.get(index).costo) {
            return true;
        } else {
            return false;
        }
    }

    protected abstract boolean disponibile(int index);
}
