package errori;

public class StanzaOccupata extends Exception{
    public StanzaOccupata(){
        super("La stanza non è libera al momento");
    }
}
