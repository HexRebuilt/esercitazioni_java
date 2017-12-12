package tester;

import ristoranti.Ristorante;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Teste {

    public static void main(String[] args) throws IOException {

        Ristorante luchini=new Ristorante("Luchini");

        FileReader fileReader=new FileReader("menu1.txt");
        BufferedReader lettore= new BufferedReader(fileReader);
        luchini.creaMenu(lettore);

        luchini.stampaMenu();
        luchini.removeElemento("Filetto al pepe verde");
        luchini.stampaMenu();






        try {
            lettore.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileReader.close();

    }





}
