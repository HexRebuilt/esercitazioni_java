package match;

public class Risultato {
    /*[0]=getPunti_C();
    [1]=getPunti_O();
    [2]=getSet_C();
    [3]=getSet_O();
    [4]=getTempo();
    [5]=getTout_C();
    [6]=getTout_O();
    */
    public int ptc,pto,setc,seto,tempo,toutc,touto;


    public Risultato() {
        this.ptc = 0;
        this.pto = 0;
        this.setc = 0;
        this.seto = 0;
        this.tempo = 0;
        this.toutc = 0;
        this.touto = 0;
    }

    public int getPtc() {
        return ptc;
    }

    public int getPto() {
        return pto;
    }

    public int getSetc() {
        return setc;
    }

    public int getSeto() {
        return seto;
    }

    public int getTempo() {
        return tempo;
    }

    public int getToutc() {
        return toutc;
    }

    public int getTouto() {
        return touto;
    }

    public void setPtc(int ptc) {
        this.ptc = ptc;
    }

    public void setPto(int pto) {
        this.pto = pto;
    }

    public void setSetc(int setc) {
        this.setc = setc;
    }

    public void setSeto(int seto) {
        this.seto = seto;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void setToutc(int toutc) {
        this.toutc = toutc;
    }

    public void setTouto(int touto) {
        this.touto = touto;
    }
}
