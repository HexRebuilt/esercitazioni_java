import errori.NessunaDigitata;
import rooms.Stanza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Struttura {
    private ArrayList<Stanza> stanze;
    private ArrayList<String[]> file;

    public Struttura(ArrayList fileAperto) {
        this.stanze = new ArrayList<>();
        this.file=fileAperto;
    }

    public void costomensile(){
        for (int i=0;i<stanze.size();i++){

        }
    }

    public void addServizio(){
        String servizi=keyboard();
    }

    public void newRoom(){
        String stanza=keyboard();

    }

    private String keyboard(){
        String letta=null;
        InputStreamReader tastiera=new InputStreamReader(System.in);
        BufferedReader buff=new BufferedReader(tastiera);
        try {
            letta=buff.readLine();
        } catch (IOException e) {
            new NessunaDigitata();
        }
        try {
            tastiera.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return letta;
    }
}
