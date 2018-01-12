import eccezioni.empty;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class keyboard {
    public String leggo() throws Exception{

        InputStreamReader lettore=new InputStreamReader(System.in);
        BufferedReader buff=new BufferedReader(lettore);

        try {
            return buff.readLine();
        }
        catch(Exception e){
            throw new empty();
        }
    }
}
