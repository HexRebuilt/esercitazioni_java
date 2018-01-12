package match;

public class Pallavvolo extends Partita {

    public int set_C, set_O, tout_C, tout_O;


    public Pallavvolo() {
        super();
        this.event =tipi.PALLAVVOLO;
        this.n_casa = "A";
        this.n_osp = "B";
        this.set_C = 0;
        this.set_O = 0;
        this.tout_C = 0;
        this.tout_O = 0;
    }
    public int getSet_C() {
        return set_C;
    }

    public void setSet_C() {
        this.set_C = set_C++;
    }

    public int getSet_O() {
        return set_O;
    }

    public void setSet_O() {
        this.set_O = set_O++;
    }

    public int getTout_C() {
        return tout_C;
    }

    public void setTout_C() {
        this.tout_C = tout_C++;
    }

    public int getTout_O() {
        return tout_O;
    }

    public void setTout_O() {
        this.tout_O = tout_O++;
    }
}
