package Clinica;

public class Fisioterapista {
    private String[] nome;
    private int id;

    public Fisioterapista(String nome,int id){
        this.nome=nome.split(" ");
        this.id=id;
    }
}
