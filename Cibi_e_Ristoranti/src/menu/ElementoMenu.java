package menu;

import alimenti.Alimento;

public class ElementoMenu {
    private Alimento alimento;
    private double prezzo;

    public ElementoMenu(Alimento alimento, double prezzo){
        this.alimento = alimento;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return alimento + " il prezzo e': "+ prezzo;
    }

    public boolean trovaElemento(String cibo){
        if(cibo.equals(alimento.getNome())){
            return true;
        }
        else{
            return false;
        }
    }
}
