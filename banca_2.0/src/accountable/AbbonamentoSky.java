package accountable;

public class AbbonamentoSky extends AbstractAccountable {
    private double importo;

    public AbbonamentoSky(double importo) {
        this.importo = importo;
        this.type= AccountableType.ABBONAMENTO;
    }

    public double getImporto() {
        return -importo;
    }

}


