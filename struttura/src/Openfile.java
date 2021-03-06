import errori.FileNonTrovato;
import errori.FileVuoto;
import errori.NessunaDigitata;

import java.io.*;
import java.util.ArrayList;

public class Openfile {
    private String letta;
    private BufferedReader reader;
    private InputStreamReader keyboard;
    private FileReader file;
    private BufferedReader digitata;

    public String tastiera(){
        keyboard=new InputStreamReader(System.in);
        digitata=new BufferedReader(keyboard);
        try {
            letta=digitata.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            keyboard.close();
        } catch (IOException e) {
            new NessunaDigitata();
        }
        return letta;
    }

    private void apriFile(){
        String percorso=tastiera();
        try {
            file=new FileReader(percorso);
        } catch (FileNotFoundException e) {
            new FileNonTrovato();
        }
        reader=new BufferedReader(file);
    }

    public ArrayList apri(){
        ArrayList<String[]> unpacked=new ArrayList<>();
        apriFile();
        try {
            while ((letta=reader.readLine()) != null) {
                unpacked.add(letta.split("\t"));
            }
        } catch (IOException e) {
            new FileVuoto();
        }
        return unpacked;
    }

}
