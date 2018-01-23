import distributore.Distributore;

public class test {
    public static void main(String[] args) {
        OpenFile openFile=new OpenFile();
        System.out.println("Scrivere il nome del file da aprire");

        openFile.apriFile();
        Distributore distributore;

        distributore=openFile.creaDistributore();
        distributore.prendiElemento();
        distributore.printDisponibili();
        distributore.printEsauriti();



    }
}
