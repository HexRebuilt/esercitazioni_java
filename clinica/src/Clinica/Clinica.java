package Clinica;

import Agenda.Agenda;
import Errori.PatologiaNonCurata;

import java.util.ArrayList;

public class Clinica {
    private ArrayList<String[]> lista;
    private String nome;
    private ArrayList<Struttura> strutture;

    public Clinica(ArrayList lista,String nome){
        this.lista=lista;
        this.nome=nome;
        this.strutture=new ArrayList<>();
    }


    public void creaStruttura(String nomeStruttura,String patologie,String nomeTerapista,int idTerapista){
        Struttura temp=new Struttura(patologie,nomeStruttura,nomeTerapista,idTerapista);
        strutture.add(temp);
    }

    public void addStruttura(Struttura aggiungo){
        strutture.add(aggiungo);
    }

    public void aggiungiAppuntamenti(){
        for (int i=0;i<lista.size();i++){
            String[] riga=lista.get(i);
            aggiungiSingoloAppuntamento(riga);
        }
    }

    private void aggiungiSingoloAppuntamento(String[] riga){
        boolean aggiunto=false;
        for (int i=0;i<strutture.size();i++){
            Struttura check=strutture.get(i);
            if (check.checkPatologia(riga[2])){
                strutture.get(i).creaAppuntamenti(riga);
                aggiunto=true;
            }
        }
        if (!aggiunto){
            new PatologiaNonCurata();
        }

    }

}
