package errori;

public class codInvalido extends Exception {
    public codInvalido(){
        super("Codice non presente");
    }
}
