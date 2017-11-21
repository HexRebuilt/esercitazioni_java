package conto;

import accountable.AbbonamentoSky;
import accountable.Accountable;
import accountable.AccountableType;
import accountable.Stipendio;
import exceptions.InvalidOP;
import exceptions.LoginError;
import exceptions.SaldoInsufficiente;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public abstract class Conto {
    final String iban;
    private String cf;
    protected double saldo;
    protected List<Accountable> accountable;

    public Conto(String iban, String cf) {
        this.iban = iban;
        this.cf = cf;
        this.saldo = saldo;
        saldo=0;
        this.accountable= new ArrayList<>();
    }

    public boolean operazione(double valore) throws SaldoInsufficiente, LoginError, InvalidOP {
        if (valore<0 && saldo<abs(valore)){
            //non posso fare l'operazione
            throw new SaldoInsufficiente();
        }
        saldo+=valore; //perche' le mie opreazioni saranno in + e -
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCf() {
        return cf;
    }

    public String toString() {
        return "Iban: "+(String)iban+"\tCodice fiscale: "+cf+"\tSaldo: "+saldo;
    }

    public void createAccountable (double importo, AccountableType tipo){
        if (tipo == AccountableType.ABBONAMENTO){
            //sto creando un abbonamento
            AbbonamentoSky abbonamento=new AbbonamentoSky(importo);
            accountable.add(abbonamento);
        }
        else {
            //sto creando uno stipendio
            Stipendio stipendio = new Stipendio(importo);
            accountable.add(stipendio);
        }

    }

    public void eseguiAccountable (){
        for (int i=0;i<accountable.size();i++){
            double valore=accountable.get(i).getImporto();
            try {
                operazione(valore);
            } catch (SaldoInsufficiente saldoInsufficiente) {
                saldoInsufficiente.printStackTrace();
            } catch (InvalidOP invalidOP) {
                invalidOP.printStackTrace();
            } catch (LoginError loginError) {
                loginError.printStackTrace();
            }

        }
    }
}
