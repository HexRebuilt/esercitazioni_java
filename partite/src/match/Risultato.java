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


    public int getRisultato(int i) {
        switch (i){
            case 0:
                return ptc;
            case 1:
                return pto;
            case 2:
                return setc;
            case 3:
                return seto;
            case 4:
                return tempo;
            case 5:
                return toutc;
            case 6:
                return touto;
            default:
                return 0;
        }
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
