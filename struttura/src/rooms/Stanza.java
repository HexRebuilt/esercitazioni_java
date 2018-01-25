package rooms;

import servizi.Servizi;

import java.util.ArrayList;

public abstract class Stanza {
    protected ArrayList<Servizi> servizi;
    protected int id;
    protected String tipo;
    protected double metratura;
    protected int persone,abitanti;
    protected double costoMetro,costoMese,costoFisso;
    protected boolean occupata;
    public String intestatario;

    public Stanza(int id, String tipo, double metratura, int persone) {
        this.id = id;
        this.tipo=tipo;
        this.metratura = metratura;
        this.persone = persone;
        this.costoFisso=100.0;
        this.abitanti=0;
        this.servizi=new ArrayList<>();
        setLibera();
    }

    public ArrayList<Servizi> getServizi() {
        return servizi;
    }

    public void addServizio(Servizi service){
       servizi.add(service);
    }

    public void removeServizi0(Servizi service){
        servizi.remove(service);
    }

    public double costoTot(){
        costoMese=costoFisso+costoMese+costoMetro*metratura+costoServizi();
        return costoMese;
    }

    public boolean isOccupata() {
        return occupata;
    }

    protected void setOccupata() {
        occupata = false;
    }

    public void setLibera(){
        occupata=true;
        servizi.clear();
    }

    public void newRoom(String intestatario,int abitanti){
                this.abitanti=abitanti;
                this.intestatario=intestatario;
                setOccupata();
    }

    protected abstract double costoServizi();

    public abstract void stampa();
}
