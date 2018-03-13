package Clinica;

import Agenda.Agenda;
import Errori.DayNotAvaible;

import java.util.ArrayList;

public class Struttura {
    private Fisioterapista fisioterapista;
    private ArrayList<String> patologie;
    private String nome;
    private Agenda agenda;


    public Struttura(String patologie,String nomestruttura,String fisioterapista,int idTerapista){
        this.patologie=new ArrayList<>();
        addPatologie(patologie);
        this.fisioterapista=new Fisioterapista(fisioterapista,idTerapista);
        this.nome=nomestruttura;
        this.agenda=new Agenda();

    }

    private void addPatologie(String patologia) {
        patologia=patologia.toUpperCase();
        String[] patNun=patologia.split(" ");

        for (int i=0;i<patNun.length;i++){
            patologie.add(patNun[i]);
        }
    }

    public boolean checkPatologia(String pat) {
        for(int i=0;i<patologie.size();i++){
            if (pat.equals(patologie.get(i))){
                return true;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void creaAppuntamenti(String[] riga) {
        try {
            agenda.creaAppuntamenti(riga,nome);
        } catch (DayNotAvaible dayNotAvaible) {
            dayNotAvaible.printStackTrace();
        }finally {
            return;
        }
    }
}
