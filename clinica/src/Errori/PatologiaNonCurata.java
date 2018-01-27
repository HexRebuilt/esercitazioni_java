package Errori;

public class PatologiaNonCurata extends Throwable {
    public PatologiaNonCurata(){
        super("Patologia non curabile in questa clinica");
    }
}
