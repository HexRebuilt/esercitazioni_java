import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class teste {
    /*
    voglio creare una calcolatrice capace di sommare vari valori tramite una stringa. se non ho numeri devo avere 0
     */
    @Test //serve ad identificarlo come test
    public void parseNumberOne(){
        Calculator calculator=new Calculator();
        int result = calculator.parse("1");
        assertThat(result,is(1));
    }

    @Test //serve ad identificarlo come test
    public void parseTwoNumber(){
        Calculator calculator=new Calculator();
        int result = calculator.parse("1,2");
        assertThat(result,is(3));
    }
    @Test //serve ad identificarlo come test
    public void parseManyNumber(){
        Calculator calculator=new Calculator();
        int result = calculator.parse("1,2,3,4");
        assertThat(result,is(10));
    }
    @Test //serve ad identificarlo come test
    public void parseNoNumber(){
        Calculator calculator=new Calculator();
        int result = calculator.parse("");
        assertThat(result,is(0));
    }

    @Test //serve ad identificarlo come test
    public void parseLetters(){
        Calculator calculator=new Calculator();
        int result = calculator.parse("1, ABCD");
        assertThat(result,is(1235));
    }

    @Test //serve ad identificarlo come test
    public void parseOnlyLetters(){
        Calculator calculator=new Calculator();
        int result = calculator.parse("A, AB");
        assertThat(result,is(13));
    }
    @Test //serve ad identificarlo come test
    public void parseCambioIdee (){
        //il cliente associa una lettera ad un valore. a=1,b=2 ecc, se ab ho 12
        Calculator calculator=new Calculator();
        int result = calculator.parse("1, AB");
        assertThat(result,is(13));
    }
}
