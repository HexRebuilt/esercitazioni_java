package exceptions;

public class LoginError extends Exception{
    public LoginError(){
        super("Credenziali errate");
    }
}
