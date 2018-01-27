package Agenda;
import Errori.DayNotAvaible;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Agenda {
    private final int[] giorniLavorativi= new int[]{1,2,3,4,5},oreLavorative=new int[]{8,9,10,11,12,13,14,15,16,17};
    private boolean[][] prenotazioni;
   private ArrayList<Appuntamenti> appuntamenti;

    public Agenda() {
        this.appuntamenti = new ArrayList<>();
        this.prenotazioni=new boolean[giorniLavorativi.length][oreLavorative.length];
        inizializzaPrenotazioni();
    }

    private void inizializzaPrenotazioni() {
        for (int i=0;i<giorniLavorativi.length;i++){
            for (int j=0;j<oreLavorative.length;j++){
                prenotazioni[i][j]=true;
            }
        }
    }

    public void creaAppuntamenti(String[] riga,String nome) throws DayNotAvaible {
        Appuntamenti temp=null;
        int[] disp;
        switch (riga.length){
                case 3:
                    temp = new Appuntamenti(riga[0],riga[1],nome);
                    disp=checkDisponibilita();
                    if (disp!=null) {
                        temp.setData(disp[0]);
                        temp.setOra(disp[1]);
                    }else {
                        return;
                    }
                    break;

                case 4:
                    temp= new Appuntamenti(riga[0],riga[1],nome,parseInt(riga[3]));
                    disp=checkDisponibilita(parseInt(riga[3]));
                    if (disp!=null) {
                        temp.setData(parseInt(riga[3]));
                        temp.setOra(disp[1]);
                    }else {
                        return;
                    }//aggiungo parti
                    break;
            }


            appuntamenti.add(temp);
        }

    private int[] checkDisponibilita() throws DayNotAvaible {
        for (int i=0;i<giorniLavorativi.length;i++){
            for (int j=0;j<oreLavorative.length;j++){
                if (prenotazioni[i][j]){
                    prenotazioni[i][j]=false;
                    return new int[]{i,j};
                }
            }
        }
        throw new DayNotAvaible();
    }

    private int[] checkDisponibilita(int i) throws DayNotAvaible {
        if (i>5){
            return null;
        }
        else {
            i--;
        }
        int[] ret=new int[2];

        for (int j=0;j<oreLavorative.length;j++){
            if (prenotazioni[i][j]){
                prenotazioni[i][j]=false;
                ret[0]=i;
                ret[1]=j;
                return ret;
            }
        }
        throw new DayNotAvaible();
    }
}

