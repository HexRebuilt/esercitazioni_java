package accountable;

public class AbbonamentoSky extends AbstractAccountable {
    private double importo;

    public AbbonamentoSky(float importo) {
        this.importo = importo;
    }

    public double getImporto() {
        return importo;
    }
}


