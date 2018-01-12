import eccezioni.empty;
import match.Calcio;
import match.Pallavvolo;
import match.Partita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

        if (nome_file.equals("calcio.txt")){
            Calcio game=new Calcio();
        }
        else {
            Pallavvolo game=new Pallavvolo();
        }

        switch (game.getipo.odinal()){
            case 0://calcio

                break;
            case 1://volley

                break;
        }



    }
}
