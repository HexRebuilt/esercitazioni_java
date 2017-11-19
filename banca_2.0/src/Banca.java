import conto.Conto;
import conto.Corrente;
import conto.Deposito;
import conto.Web;

import java.util.HashMap;
import java.util.Map;

public class Banca {
    final String radiceIban;
    private HashMap<String,Conto> conti;
    private int numConti;

    public Banca(String radiceIban) {
        this.radiceIban = radiceIban;
        this.conti = conti;
        this.numConti=0;
        conti= new HashMap<>();
    }

    private String generateIban(){
        return radiceIban+numConti;

    }

    public void creaConto(String cf, c_type tipoc){
        String iban=generateIban();
        numConti++; // per il prossimo conto sono gia' pronto
        Conto conto = null;

        //seleziono il tipo di conto da creare
        switch (tipoc.ordinal()) {

            case 0:
                conto = new Corrente(iban, cf);
                break;
            case 1:
                conto = new  Deposito(iban, cf);
                break;
            case 2:
                conto = new Web(iban, cf);
                break;
        }

       conti.put(iban,conto);
    }

    public void saldo(String iban){//mostro il saldo di tutti
        System.out.println("Il saldo del conto "+iban+" e' "+conti.get(iban).getSaldo());
        }

    public void operazB (String iban,double valore){
        if (!conti.get(iban).operazione(valore)){
            //se ritorna true tutto è andato a buon fine e non serve far altro
            System.out.println("Non e' stato possibile svolgere l'operazione sul conto "+iban);
        }
    }

    public void dettagliConto(String iban){
        System.out.println("Conto num "+iban+" cf: "+conti.get(iban).getCf()+" saldo: "+conti.get(iban).getSaldo());
    }

    public void finemese(String giorno){
        if (giorno==)
    }

}
