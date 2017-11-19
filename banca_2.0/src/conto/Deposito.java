package conto;

public class Deposito extends Conto {

    public Deposito(String iban, String cf) {
        super(iban, cf);
    }

    @Override
    public boolean operazione (double valore){
        if (valore < 0){
            return false;
        }
        else{
            saldo=saldo+valore;
            return true;
        }
    }
}
