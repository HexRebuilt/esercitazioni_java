package match;

public class Pallavvolo extends Partita {

    public int set_C, set_O, tout_C, tout_O;


    public Pallavvolo() {
        super();
        this.event = Tipi.PALLAVVOLO;
        this.n_casa = "A";
        this.n_osp = "B";
        this.set_C = 0;
        this.set_O = 0;
        this.tout_C = 0;
        this.tout_O = 0;
    }

    @Override
    protected void analizzaCod(int cod){
        /*V-00 Inizio partita
        V-01 Inizio nuovo set
        V-02 Fine set corrente
        V-03 Punto per la squadra di casa
        V-04 Punto per la squadra ospite
        V-05 Time-out per la squadra di casa
        V-06 Time-out per la squadra ospite
        V-98 Generico commento
        V-99 Fine partita
                */
        switch (cod){
            case 0:
                //todo inizio partita
                setTempo();
                break;
            case 1:
                setTempo();
                break;
            case 2:
                //todo fine set corrente assegno i pt ai set
                if (getPunti_C()==getPunti_O()) {
                    break;
                }
                if (getPunti_C()>getPunti_O()){
                    setSet_C();
                }
                else {
                    setSet_O();
                }
                break;
            case 3:
                addPuntiC();
                break;
            case 4:
                addPuntiO();
                break;
            case 5:
                setTout_C();
                break;
            case 6:
                setTout_O();
                break;
            case 98:
                //todo passo commento generico
                break;
            case 99:
                //todo endgame
                break;
        }
        //ora manggio il resto da updatare nella interfaccia.

    }


    public int getSet_C() {
        return set_C;
    }

    protected void setSet_C() {
        this.set_C = set_C++;
    }

    public int getSet_O() {
        return set_O;
    }

    protected void setSet_O() {
        this.set_O = set_O++;
    }

    public int getTout_C() {
        return tout_C;
    }

    protected void setTout_C() {
        this.tout_C = tout_C++;
    }

    public int getTout_O() {
        return tout_O;
    }

    protected void setTout_O() {
        this.tout_O = tout_O++;
    }

    @Override
    public String toString() {
        return (super.toString()+("\tTime out casa:"+getTout_C()+"\tTime out ospiti: "+getTout_O()+"\tSet vinti dalla casa: "+getSet_C()+"\tSet vinti dalgi ospiti: "+getSet_O()));
    }
}
