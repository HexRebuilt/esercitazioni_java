import Clinica.Clinica;

public class Test {
    public static void main(String[] args) {
        OpenFile openFile=new OpenFile("prenotazioni.txt");
        Clinica clinica=new Clinica(openFile.aprifile(),"Peppiniello");
        clinica.creaStruttura("Piscina","pato4 PATO5","Gianluigi Pernelli",001);
        clinica.creaStruttura("Palestra","pato1 pato2 pato3","Antoniangelo Feltrini",002);
        clinica.creaStruttura("Sala massaggi","pato6 pato7 pato8 pato9","Simonetta Buzzolenti",003);




    }
}
