package alimenti;

public abstract class Alimento {
    private String nome;


    public Alimento(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Nome: "+nome+"\t ";
    }

    public String getNome() {
        return nome;
    }
}
