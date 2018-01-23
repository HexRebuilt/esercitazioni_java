package distributore;
import distributore.Elementi.Elemento;
import errori.elementoNonTrovato;
import errori.nessunaDigitata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public abstract class Distributore {
    protected ArrayList<String[]> file;
    protected ArrayList<Elemento> elementi;
    private double moneteTot;
    private double soldicorrenti;

    public Distributore(ArrayList<String[]> file) {
        this.elementi = new ArrayList<>();
        this.file = file;
        creaLista();
        this.moneteTot = 0;
        this.soldicorrenti=0;
    }

    protected abstract void creaLista();

    protected abstract void togliElemento(int index);

    protected abstract void refill(int index);

    public void printLista() {
        for (int i = 0; i < elementi.size(); i++) {
            mostraElemento(i);
        }
    }

    private void mostraElemento(int index) {
        System.out.println(elementi.get(index).toString());
    }

    private int trovaElemento(String codice) {
        for (int index=0;index<elementi.size();index++){
            if (codice.equals(elementi.get(index).codice)){
                return index;
            }
        }
        return -1;
    }

    public void inserisciMonete() {
        System.out.println("Credito corrente: "+soldicorrenti+"\nInserisci quante monete da 50c, 20c, 10c, 5c, inserisci rispettivamente separate da uno spazio.\nSolo -1 per restituire le monete");
        String[] splittata=keyboard().split(" ");
        if (splittata[0].equals("-1")){
            ritornaMonete();
            splittata=null;
        }
            switch (splittata.length) {
                case 4:
                    soldicorrenti = soldicorrenti + 0.05 * parseInt(splittata[3]);
                case 3:
                    soldicorrenti = soldicorrenti + 0.10 * parseInt(splittata[2]);
                case 2:
                    soldicorrenti = soldicorrenti + 0.20 * parseInt(splittata[1]);
                case 1:
                    soldicorrenti = soldicorrenti + 0.50 * parseInt(splittata[0]);
            }

        System.out.println("Credito: "+soldicorrenti);
    }

    protected void ritornaMonete(){
        soldicorrenti=0;
    }

    private String keyboard(){
            InputStreamReader keyboard=new InputStreamReader(System.in);
            BufferedReader bufferedReader=new BufferedReader(keyboard);
            try {
                return bufferedReader.readLine().toUpperCase();
            } catch (IOException e) {
                new nessunaDigitata();
            }
            return null;
    }

    private boolean checkCosto( int index) {
        if (soldicorrenti >= elementi.get(index).costo) {
            return false;
        } else {
            return true;
        }
    }

    protected abstract boolean disponibile(int index);

    public void prendiElemento(){
        printLista();
        System.out.println("\nSelezionare il codice:");
        String selezione=keyboard();
        int index=-1;
        index=trovaElemento(selezione);

        if (disponibile(index)){
            while (checkCosto(index)){
                inserisciMonete();
            }
            togliElemento(index);
            moneteTot=moneteTot+soldicorrenti;
            soldicorrenti=soldicorrenti-elementi.get(index).costo;
        }


        System.out.println("Prendere l'elemento selezionato. Credito rimasto: "+soldicorrenti);
    }

}
