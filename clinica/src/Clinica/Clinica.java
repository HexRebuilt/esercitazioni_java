package Clinica;

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

}
