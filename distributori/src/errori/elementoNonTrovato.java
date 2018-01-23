package errori;

public class elementoNonTrovato extends Exception {
    public elementoNonTrovato(){
        super("Non esiste elemento con codice corrispondente");
    }
}
