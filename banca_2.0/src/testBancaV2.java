import accountable.AccountableType;

public class testBancaV2 {
    public static void main(String[] args) {

        Banca bank=new Banca("PAPER0N1-");

        bank.creaConto("cf01",c_type.CORRENTE);
        bank.creaConto("cf02",c_type.DEPOSITO);
        bank.creaConto("cf03",c_type.WEB);
        bank.creaConto("cf04",c_type.CORRENTE);
        bank.creaConto("cf05",c_type.CORRENTE);
        bank.creaConto("cf06",c_type.DEPOSITO);
        bank.creaConto("cf07",c_type.WEB);

        //provo a fare operazioni
        bank.operazB("PAPER0N1-0",5000.);
        bank.operazB("PAPER0N1-2",300.);
        bank.operazB("PAPER0N1-1",5020.);
        bank.operazB("PAPER0N1-0",-8000.);
        bank.operazB("PAPER0N1-1",-80.);

        //richiedo saldo
        bank.saldo("PAPER0N1-0");
        bank.saldo("PAPER0N1-1");

        //dettagli del conto
        bank.dettagliConto("PAPER0N1-2");
//        bank.dettagliConto("PAPER0N1-3");

        //creo accountable
        bank.creaAccountable("PAPER0N1-0", AccountableType.STIPENDIO,100);
        bank.creaAccountable("PAPER0N1-0", AccountableType.ABBONAMENTO,50);

        bank.finemese();
        bank.saldo("PAPER0N1-0");

    }
}
