public class TestBanca {
    public static void main(String[] args) {
        //inserisco il nome della banca, numero conti massimi.
        String nomeBanca = "Paperone", radiceIban = "PR ABC01-";
        String cf;
        double saldo, somma;
        boolean creazione;

        Banca banca = new Banca(nomeBanca, radiceIban, 10);//la banca e' nuova non ho conti
        int i = 0;

        do {
            String iban = radiceIban + i+"-000IT"; //genero dinamicamente l' iban in base al nuemro di conto
            System.out.println("\nInserisci il CF\n");
            cf = "aaaa"+i;

            creazione = banca.creaConto(cf, iban); //passo cf, saldo iniziale e i a cui sono arrivato come numeri
            if (creazione == false) {
                System.out.println("Non e' possibile creare altri conti\n");
                break;
            }

            somma = 500.0 + i;
            boolean operazione = banca.operazione(iban, somma);
            if (operazione) {
                System.out.print("L'operazione e' avvenuta con successo, nuovo saldo: " + banca.saldo(iban) + "\n");
            } else {
                System.out.print("L'operazione non e' avvenuta\n");
            }

            somma = -50. * i;
            operazione = banca.operazione(iban, somma);

            if (operazione) {
                System.out.print("L'operazione e' avvenuta con successo, nuovo saldo: " + banca.saldo(iban) + "\n");
            } else {
                System.out.print("L'operazione non e' avvenuta\n");
            }

            i++;

        } while (creazione == true);

        //totale saldi e getconto dato iban
        //stampo elenco conti
        System.out.println("Questo e' l' elenco conti:\n");
        i=0;

        while (i<banca.getContiMax()) {
            banca.mostraConto(i);
            i++;
        }
    }

}
