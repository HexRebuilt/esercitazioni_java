import interfaccia.MainInterface;
import match.Calcio;
import match.Pallavvolo;
import match.Partita;

import javax.swing.*;
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        OpenFile openfile = new OpenFile();
        String nome_file = openfile.tastiera();

        nome_file = nome_file.toLowerCase();
        Partita game = openfile.apriFile(nome_file);

        game.commenti = openfile.leggi();
        game.getCommentCode();

        //todo dovrei iniziare a far l'interfaccia
        game.creaInterfaccia(game);

        //dato che non ho interfaccia almeno inzio ad elaborare i dati
       /*
        for(int i = 0; i<game.commenti.size();i++){
            game.scrollEvent();
            System.out.println(game.toString());
        }*/


    }
}
