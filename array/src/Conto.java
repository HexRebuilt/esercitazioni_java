public class Conto {
    private String iban, cf;
    private double saldo;

    public Conto(String iban, String cf, double saldo) {
        this.cf = cf; /* cosi' non mi confondo con i nomi della classe*/
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean deposita(double somma) {
            saldo = saldo + somma;
            return true; //e' true perche' l'operazione ha avuto successo
    }

    public boolean preleva(double somma) {
        if (somma <= saldo || saldo>0) { //controllo di avere il fido necessario
            saldo = saldo + somma;
            return true; //e' true perche' l'operazione ha avuto successo
        }
        else {
            return false;
        }
    }

}