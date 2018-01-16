import match.Calcio;
import match.Pallavvolo;
import match.Partita;

import java.io.*;
import java.util.ArrayList;

public class OpenFile {
    public String digitata;
    private BufferedReader lettore;
    private FileReader file;
    private ArrayList<String[]> riga;

    public OpenFile() {
        this.digitata=null;
        this.lettore=null;
        this.file=null;
        this.riga=new ArrayList<>();
    }

    public String tastiera() {
        InputStreamReader keyboard = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(keyboard);
        try {
            digitata= buff.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            keyboard.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return digitata;
    }

    public Partita apriFile(String nome_file){
        try {
            file = new FileReader(nome_file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        lettore = new BufferedReader(file);

        if(nome_file.equals("calcio.txt")){
            return new Calcio();
        }
        else{
            return new Pallavvolo();
        }
    }

    public ArrayList leggi(){
        String line=null;
        try {
            while ((line = lettore.readLine()) != null) {
                String[] elemento = line.split("\t");
                riga.add(elemento);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }



        return riga;
    }

}
