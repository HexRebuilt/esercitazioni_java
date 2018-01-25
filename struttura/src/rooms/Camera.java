package rooms;

public class Camera extends Stanza {
    public Camera(int id, String tipo, double metratura, int persone) {
        super(id, tipo, metratura, persone);
        this.costoMetro=8.0;
    }

    @Override
    protected double costoServizi() {
        double costotot=0;
        for (int i=0;i<servizi.size();i++){
            switch (servizi.get(i).ordinal()){
                case 0:
                    costotot=costotot+30;
                    break;
                case 1:
                    costotot=costotot+20;
                    break;
                case 2:
                    costotot=costotot+1*metratura+5*persone;
                    break;
                case 3:
                    costotot=costotot+10;
                    break;
                case 4:
                    costotot=costotot+10;
                    break;
                case 5:
                    costotot=costotot+100;
                    break;
            }
        }
        return costotot;
    }

    @Override
    public void stampa() {
        System.out.println("Stanza numero: "+id+"\tTipo: Camera\tMetratura: "+metratura+"\tRisiedenti: "+persone+"\tLibera:"+occupata);

    }
}
