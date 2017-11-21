package exceptions;

public class IbanInesistente extends Exception{
    public IbanInesistente(){
        super("Iban inesistente in questa banca");
    }
}
