package conto;

import static java.lang.Math.abs;

public abstract class Conto {
    final String iban;
    private String cf;
    protected double saldo;

    public Conto(String iban, String cf) {
        this.iban = iban;
        this.cf = cf;
        this.saldo = saldo;
        saldo=0;
    }

    public boolean operazione(double valore){
        if (valore<0 && saldo<abs(valore)){
            //non posso fare l'operazione
            return false;
        }
        saldo+=valore; //perche' le mie opreazioni saranno in + e -
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCf() {
        return cf;
    }

    public String toString() {
        return "Iban: "+(String)iban+"\tCodice fiscale: "+cf+"\tSaldo: "+saldo;
    }
}
