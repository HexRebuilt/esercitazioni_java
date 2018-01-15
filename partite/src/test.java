import match.Calcio;
import match.Pallavvolo;
import match.Partita;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {

        InputStreamReader keyboard=new InputStreamReader(System.in);
        BufferedReader buff=new BufferedReader(keyboard);
        String nome_file=buff.readLine();
        try {
            keyboard.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        nome_file=nome_file.toLowerCase();
        Partita game;

        //TODO sistemare apertura file

        FileReader file=new FileReader(nome_file);
        BufferedReader lettore = new BufferedReader(file);

        if (nome_file.equals("calcio.txt")){
            game=new Calcio();
        }
        else {
            game=new Pallavvolo();
        }

        switch (game.getEvent().ordinal()){
            case 0://calcio

                break;
            case 1://volley

                break;
        }




        lettore.close();
    }
}
