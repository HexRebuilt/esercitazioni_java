import interfaccia.CreaInterfaccia;
import match.Partita;

public class test {
    public static void main(String[] args) {
        OpenFile openfile = new OpenFile();
        String nome_file = openfile.tastiera();

        nome_file = nome_file.toLowerCase();
        Partita game = openfile.apriFile(nome_file);

        game.commenti = openfile.leggi();
        game.getCommentCode();

        //todo dovrei iniziare a far l'interfaccia

        CreaInterfaccia interfaccia=new CreaInterfaccia(game);
        interfaccia.apriInterfaccia();

    }
}
