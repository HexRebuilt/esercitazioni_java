package errori;

public class FileVuoto extends Exception{
    public FileVuoto(){
        super("Il file è vuoto");
    }
}
