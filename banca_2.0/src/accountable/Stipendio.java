package accountable;

public class Stipendio extends AbstractAccountable {
    private double importo;

    public Stipendio(double importo) {
        this.importo = importo;
        this.type=AccountableType.STIPENDIO;
    }

    public double getImporto() {
        return importo;
    }

}

