package match;
import eccezioni.empty;

import java.io.*;
import java.util.ArrayList;

public abstract class Partita {
    public String n_casa, n_osp;
    public int tempo,punti_C, punti_O;
    private BufferedReader bufferedReader;
    private FileReader fileReader;
    public Tipi event;
    private BufferedReader lettore;
    private FileReader file;
    public ArrayList<String> commenti;

    public Partita(){
        this.n_casa = n_casa;
        this.n_osp = n_osp;
        this.punti_C = 0;
        this.punti_O = 0;
        this.tempo=0;
        this.file=null;
        this.lettore=null;
        this.commenti=new ArrayList<String>();

    }

    public Partita openFile(){
        String nome_file = null;
        try {
            nome_file=tastiera();
            }
        catch (Exception e) {
                System.out.println("non riesco ad aprire la tastiera");
            }
        try {
            file = new FileReader(nome_file);
            }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        lettore = new BufferedReader(file);

        nome_file=nome_file.toLowerCase();

        if (nome_file.equals("calcio.txt")){
            return new Calcio();
        }
        else {
            return new Pallavvolo();
        }
    }

    public String tastiera() throws Exception{
        InputStreamReader keyboard=new InputStreamReader(System.in);
        BufferedReader buff=new BufferedReader(keyboard);
        String nome_file= null;
        try {
            nome_file = buff.readLine();
        } catch (IOException e) {
            throw  new empty();
        }
        try {
            keyboard.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nome_file;
    }



    public void setTempo(){
        tempo++;
    }

    public Tipi getEvent() {
        return event;
    }

    public String getN_casa() {
        return n_casa;
    }

    public void setN_casa(String n_casa) {
        this.n_casa = n_casa;
    }

    public String getN_osp() {
        return n_osp;
    }

    public void setN_osp(String n_osp) {
        this.n_osp = n_osp;
    }

    public int getPunti_C() {
        return punti_C;
    }

    public int getPunti_O() {
        return punti_O;
    }

    public void closeFile(){
        try {
            lettore.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addPunti(String squadra){
        if(squadra.equals(n_casa)){
            punti_C++;
        }
        else {
            punti_O++;
        }
    }


}
