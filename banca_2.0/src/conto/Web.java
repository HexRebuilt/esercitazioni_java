package conto;

import exceptions.InvalidOP;
import exceptions.LoginError;

public class Web extends Conto{

    final String login;
    private String psw;
    private boolean firstlogin;


    public Web(String iban, String cf) {
        super(iban, cf);
        this.login=cf+010;//associo un logn creato con il cf piu' la posizione nella mappa (numero per ora)
        this.psw=psw;
        psw="changeme";
        this.firstlogin=true;

    }

    @Override
    public boolean operazione(double valore) throws LoginError{
        //controllo che la password sia stata cambiata
        if(firstlogin){
            psw=resetpsw(psw);//controllo che sia il
        }
        //richiedo di loginare
        System.out.println("Inserire login e password:");

        String usr=login,pass=psw; //cosi' posso gestire pass o user errati ma non so come prenderli da tastiera

        if((usr==login)&&(pass==psw)){
            saldo+=valore;
            return true;
        }
        else{//ho sbagliato il login
            throw new LoginError();

        }

    }

    private String resetpsw(String psw){
        //scrivo una password composta da changeme+00 per provare non sapendo fare operazione io
        firstlogin=false;
        System.out.println("Password cambiata con successo");
        return psw+"00";

    }
}
