import distributore.Distributore;

public class test {
    public static void main(String[] args) {
        OpenFile openFile=new OpenFile();
        openFile.apriFile();
        Distributore distributore;

        distributore=openFile.creaDistributore();
        distributore.printLista();



    }
}
