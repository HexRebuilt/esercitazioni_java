package accountable;

public class Stipendio extends AbstractAccountable {
    private double importo;

    public Stipendio(double importo) {
        this.importo = importo;
    }

    public double getImporto() {
        return importo;
    }
}

