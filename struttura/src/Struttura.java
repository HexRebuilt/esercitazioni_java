import errori.StanzaOccupata;
import rooms.Camera;
import rooms.Stanza;
import rooms.Studio;
import servizi.Servizi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


public class Struttura {
    protected String letta;
    private InputStreamReader tastiera;
    private BufferedReader buff;
    private ArrayList<Stanza> stanze;
    private ArrayList<String[]> file;

    public Struttura(ArrayList fileAperto) {
        this.stanze = new ArrayList<>();
        this.file=fileAperto;
        creaStruttura();
        this.tastiera=new InputStreamReader(System.in);
        this.buff=new BufferedReader(tastiera);
    }

    private void creaStruttura() {
        for (int i=0;i<file.size();i++){
            if(file.get(i)[1].equals("A")){
                stanze.add((Stanza) new Studio( parseInt(file.get(i)[0]), file.get(i)[1], parseDouble(file.get(i)[2]), parseInt(file.get(i)[3]) )    );
            }
            else {
                stanze.add((Stanza) new Camera(parseInt(file.get(i)[0]), file.get(i)[1], parseDouble(file.get(i)[2]), parseInt(file.get(i)[3]) )     );
            }
        }
    }

    public void costomensile(int id){
       System.out.println("Costo mensile della stanza "+id+" e': "+stanze.get(id--).costoTot());
    }

    public void stampaStanze() {
        for (int i=0;i<stanze.size();i++){
            stanze.get(i).stampa();
        }
        System.out.println("\n");
    }

    public void addServizio(int id,Servizi servizio){
        stanze.get(id--).addServizio(servizio);
    }

    public void liberaStanza(int id){
        stanze.get(id--).setLibera();
        stampaStanze();
    }

    public void assegnaStanza(int id,String intestatario,int abitanti){
        id--;
        if (stanze.get(id).isOccupata()){
            stanze.get(id).newRoom(intestatario,abitanti);
        }
        else {
            new StanzaOccupata();
        }
    }


}
