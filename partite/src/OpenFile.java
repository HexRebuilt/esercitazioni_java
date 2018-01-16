import eccezioni.empty;
import match.Calcio;
import match.Pallavvolo;
import match.Partita;

import java.io.*;
import java.util.ArrayList;

public class OpenFile {
    private  FileReader file;
    private BufferedReader lettore;
    public OpenFile() {
        this.file=null;
        this.lettore=null;
    }


    public String tastiera() {
        InputStreamReader keyboard=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(keyboard);
        try{
            return input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Partita apriFile(String nome_file) {
        try {
            file=new FileReader(nome_file);
        } catch (FileNotFoundException e) {
            new empty();
        }
        nome_file=nome_file.toLowerCase();
        if (nome_file.equals("calcio.txt")){
            return new Calcio();
        }
        else {
            return new Pallavvolo();
        }
    }

    public ArrayList<String[]> leggi() {
        String riga=null;
        ArrayList<String[]> letta=new ArrayList<>();

        try {
            while ((riga=lettore.readLine())!=null){
                letta.add(riga.split("\t"));
            }
        }
        catch (Exception e){
            new empty();
        }
        return letta;
    }
}

