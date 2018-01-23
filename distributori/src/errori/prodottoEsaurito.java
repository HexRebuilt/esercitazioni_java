package errori;

public class prodottoEsaurito extends Exception {
    public prodottoEsaurito(){
        super("Al momento non disponibile");
    }
}
