import servizi.Servizi;

public class Test {
    public static void main(String[] args) {
     Openfile openfile=new Openfile();
     Struttura struttura= new Struttura(openfile.apri());
     struttura.stampaStanze();
     struttura.assegnaStanza(19,"Luigi",1);

     struttura.addServizio(19, Servizi.WIFI);
     struttura.addServizio(19,Servizi.TV);
     struttura.costomensile(19);
    }
}
