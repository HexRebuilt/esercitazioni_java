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
    private Soldi monete;

    public Distributore(ArrayList<String[]> file) {
        this.elementi = new ArrayList<>();
        this.file = file;
        creaLista();
        this.moneteTot = 0;
        this.soldicorrenti=0;
        this.monete=new Soldi();
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
        String[] splittata=keyboard().split("");
        if (splittata[0].equals("-1")){
            ritornaMonete();
        }
        for (int i=0;i<splittata.length;i++){
            soldicorrenti=monete.monete[i]*parseInt(splittata[i]);
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
            return true;
        } else {
            return false;
        }
    }

    protected abstract boolean disponibile(int index);

    public void prendiElemento(){
        printLista();
        System.out.println("Selezionare il codice");
        String selezione=keyboard();
        int index=-1;
        index=trovaElemento(selezione);

        if (disponibile(index) && index>0){
            while (checkCosto(index)){
                inserisciMonete();
            }
            togliElemento(index);
            moneteTot=moneteTot+soldicorrenti;
        }


        System.out.println("Prendere l'elemento selezionato");
    }

}
