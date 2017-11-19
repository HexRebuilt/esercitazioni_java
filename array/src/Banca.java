public class Banca {
    private int contiMax=10,countC=0;//l' indice 0 e' di errore, countC mi dice i conti totali che ho
    private String nomeBanca;
    private Conto [] conti;
    private String radiceIban;



    public Banca(String nomeBanca, String radiceIban, int contiMax){
        this.nomeBanca=nomeBanca;
        this.radiceIban=radiceIban;
        this.conti = new Conto[contiMax];
        this.contiMax=contiMax;
        this.countC=countC; //contatore conti attivi

    }


    public String getNomeBanca() {
        return nomeBanca;
    }

    public int getContiMax() {
        return contiMax;
    }

    public boolean creaConto(String cf, String Iban) {
        int i=countC;//trovo ultimo conti libero
        if (i == contiMax) {
            return false;
        }
        else {
            countC++;
            conti[i] = new Conto(radiceIban +i+"-000IT", cf, 0);
            return true;
        }
    }

    public boolean operazione (String iban,double somma) {
        Conto c = trovaConto(iban);
        if (c == null) {
            return false;
        }
        else{
            if(somma>=0) {
                return c.deposita(somma);
            }
            else{
                return c.preleva(somma);
            }

        }
    }


    public Conto trovaConto(String iban){
        for (int i=0;i<countC;i++){
            if(conti[i].getIban().equals(iban)){ //equals  considera i caratteri in senso lettere e non come case sensistive e cifre associate
                return conti[i];
            }
        }
        return null; //devo gestire l'indice 0 come indice di errore
    }

    public double saldo(String iban){
        double s;
        Conto c= trovaConto(iban);
        if (c==null){
            return 0.;
        }
        s= c.getSaldo();
        return s;
    }

    public void mostraConto(int i){
        System.out.println(conti[i].getIban()+"\n");
    }

}
