import match.Calcio;
import match.Pallavvolo;
import match.Partita;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        OpenFile openfile=new OpenFile();
        String nome_file=openfile.tastiera();

        nome_file=nome_file.toLowerCase();
        Partita game=openfile.apriFile(nome_file);
        game.commenti=openfile.leggi();

        game.getCommentCode();








    }
}
