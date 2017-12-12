package menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Menu {
    private List <ElementoMenu> alimento;

    public Menu() {
        this.alimento=new ArrayList<>();

    }

    public void addElemento(ElementoMenu cibo){
            alimento.add(cibo);
    }

    public void removeElemento (String cibo){
        ElementoMenu tolgo=trovaElemento(cibo);
        alimento.remove(tolgo);
        }


    public ElementoMenu trovaElemento(String cibo) {
        boolean cerco;
        for (ElementoMenu i : alimento) {
            cerco = i.trovaElemento(cibo);
            if(cerco) {
                return i;
            }
        }
        return null;
    }


    public void stampaMenu() {
        for(ElementoMenu i : alimento) {
            System.out.println(i.toString());
        }
    }
}
