package accountable;

public abstract class AbstractAccountable implements Accountable {
    protected AccountableType type;

    public AccountableType getType() {
        return type;
    }
}
