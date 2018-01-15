package match;

public class Calcio extends Partita {
    public Calcio() {
        super();
        this.event = Tipi.CALCIO;
    }


    public String getN_casa() {
        return n_casa;
    }

    public void setN_casa(String n_casa) {
        this.n_casa = n_casa;
    }

    public String getN_osp() {
        return n_osp;
    }

    public void setN_osp(String n_osp) {
        this.n_osp = n_osp;
    }


    public void analizzaCod(int cod){
        /*
        C-00 Inizio partita
        C-01 Fine primo tempo
        C-02 Inizio secondo tempo
        C-04 Gol per la squadra di casa
        C-05 Gol per la squadra in trasferta
        C-98 Generico commento
        C-99 Fine partita
                */
        switch (cod){
            case 0:
                //todo trigghero lo start match
                break;
            case 1:
                //todo setto intervallo nella interfaccia
                break;
            case 2:
                setTempo();
                break;
            case 4:
                addPuntiC();
                break;
            case 5:
                addPuntiO();
                break;
            case 98:
                //todo passo all'interfaccia il commento corrente
                break;
            case 99:
                //todo fine partita in out
        }

    }

}
