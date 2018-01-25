package errori;

public class FileNonTrovato extends Exception {
    public FileNonTrovato(){
        super("Non è stato trovato il file selezionato");
    }
}
