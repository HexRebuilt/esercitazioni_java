import accountable.AbbonamentoSky;
import accountable.Accountable;
import accountable.AccountableType;
import accountable.Stipendio;
import conto.Conto;
import conto.Corrente;
import conto.Deposito;
import conto.Web;
import exceptions.IbanInesistente;
import exceptions.InvalidOP;
import exceptions.LoginError;
import exceptions.SaldoInsufficiente;

import java.util.HashMap;
import java.util.Map;

public class Banca {
    final String radiceIban;
    private HashMap<String,Conto> conti;
    private int numConti;
    private HashMap<String,Accountable[]> accountableHashmap;

    public Banca(String radiceIban) {
        this.radiceIban = radiceIban;
        this.conti = conti;
        this.numConti=0;
        conti= new HashMap<>();

        this.accountableHashmap=accountableHashmap;
        accountableHashmap=new HashMap<>();
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

    public void operazB (String iban,double valore) {
        try {
            if (conti.get(iban)==null){
            System.out.println("Iban inesistente in questa banca");
            }
            else{
                conti.get(iban).operazione(valore);
            }
        } catch (SaldoInsufficiente saldoInsufficiente) {
            saldoInsufficiente.printStackTrace();
        } catch (InvalidOP invalidOP) {
            invalidOP.printStackTrace();
        } catch (LoginError loginError) {
            loginError.printStackTrace();
        }
    }

    public void dettagliConto(String iban){
        System.out.println("Conto num "+iban+" cf: "+conti.get(iban).getCf()+" saldo: "+conti.get(iban).getSaldo());
    }

    public void creaAccountable (String iban, AccountableType tipo, double valore){
       conti.get(iban).createAccountable(valore,tipo);

    }

    public void finemese(){
        int dim=conti.size();
        for (int i=0;i<dim;i++) {
            String iban=radiceIban+i; //e'lo stesso modo in cui creo gli iban
            conti.get(iban).eseguiAccountable();
        }
    }

}
