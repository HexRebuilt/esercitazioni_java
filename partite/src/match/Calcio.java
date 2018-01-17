package match;

public class Calcio extends Partita {
    public Calcio() {
        super();
        this.event = Tipi.CALCIO;
    }


    @Override
    protected void analizzaCod(int cod){
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
                setTempo();
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
                finepartita=true;
        }

    }

    @Override
    public String toString() {
        return null;
    }

    public int getTout_C(){
        return 0;
    }

    @Override
    public int getTout_O() {
        return 0;
    }

    @Override
    public int getSet_O() {
        return 0;
    }

    @Override
    public int getSet_C() {
        return 0;
    }

}
