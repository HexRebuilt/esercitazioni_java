package ristoranti;

import alimenti.bevande.Vino;
import alimenti.cibi.Carne;
import menu.ElementoMenu;
import menu.Menu;

import java.io.BufferedReader;
import java.io.IOException;

public class Ristorante {
    private String nome;
    private Menu lista;

    public Ristorante(String nome) {
        this.nome=nome;
        this.lista = new Menu();
    }

    public void creaMenu(BufferedReader lettore){
        //splitto le stringhe in base alla tabulazione \t
        String line;
        try {
            while ((line=lettore.readLine())!=null){
                String[] elemento=line.split("\t");

                //0 e' ristorante 1 enoteca
                switch (Integer.parseInt(elemento[0])){
                    case 0:
                        ElementoMenu cibo= creaCibo(elemento);
                        lista.addElemento(cibo);
                        break;
                    case 1:
                        ElementoMenu vino=creaVino(elemento);
                        lista.addElemento(vino);
                        break;
                }
            }

        } //TODO sistemo le eccezioni
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ElementoMenu creaVino(String[] elemento) {
        Vino vino=new Vino(elemento[1], Double.parseDouble(elemento[2]), elemento[3], elemento[4]);
        ElementoMenu elementoMenu=new ElementoMenu(vino,Double.parseDouble(elemento[5]));
        return elementoMenu;
    }

    private ElementoMenu creaCibo(String[] elemento) {
        Carne carne=new Carne(elemento[1], elemento[2], elemento[3]);
        ElementoMenu elementoMenu=new ElementoMenu(carne,Double.parseDouble(elemento[4]));
        return elementoMenu;
    }

    public void stampaMenu(){
            lista.stampaMenu();

    }

    public void removeElemento(String elementoMenu){
        lista.removeElemento(elementoMenu);

    }
}
