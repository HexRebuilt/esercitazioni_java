package exceptions;

public class InvalidOP extends Exception{
    public InvalidOP(){
        super("Non e' possibile prelevare da un conto deposito");
    }
}
