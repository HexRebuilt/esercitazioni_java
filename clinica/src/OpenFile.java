import java.io.*;
import java.util.ArrayList;

public class OpenFile {

    private String nomefile;
    private FileReader file;
    private BufferedReader buff;

    public OpenFile(String nomeflile){
        this.nomefile=nomeflile;
        try {
            this.file=new FileReader(nomeflile);
        } catch (FileNotFoundException e) {
            //todo sistemo errore
            e.printStackTrace();
        }
        this.buff=new BufferedReader(file);
    }

    public ArrayList<String[]> aprifile(){
        ArrayList<String[]> testo=new ArrayList<>();
        String aperta;
        String[] splittata;

        try {
            while ((aperta=buff.readLine())!=null){
                splittata=aperta.split("\t");
                testo.add(splittata);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return testo;
    }



}
