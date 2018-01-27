package Agenda;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Agenda {
    private final int[] giorniLavorativi= new int[]{1,2,3,4,5},oreLavorative=new int[]{8,9,10,11,12,13,14,15,16,17};
    private ArrayList<Appuntamenti> appuntamenti;

    

    private void creaAppuntamenti() {
        String[] letta;
        Appuntamenti temp=null;

        for (int i=0;i<lista.size();i++) {
            letta=lista.get(i);
            switch (letta.length){
                case 3:
                    temp = new Appuntamenti(letta[0],letta[1],letta[2]);
                    break;
                case 4:
                    temp= new Appuntamenti(letta[0],letta[1],letta[2],parseInt(letta[3]));
            }
            appuntamenti.add(temp);
        }
    }

}
