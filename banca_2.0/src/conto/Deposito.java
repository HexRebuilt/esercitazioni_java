package conto;

import exceptions.InvalidOP;

public class Deposito extends Conto {

    public Deposito(String iban, String cf) {
        super(iban, cf);
    }

    @Override
    public boolean operazione (double valore) throws InvalidOP{
        if (valore < 0){
            throw new  InvalidOP();
        }
        else{
            saldo=saldo+valore;
            return true;
        }
    }
}
