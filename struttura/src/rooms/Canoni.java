package rooms;

import java.util.HashMap;
import java.util.Map;

public class Canoni {
    private Map<String,Double> canone;

    public Canoni(){
        this.canone=new HashMap<>();
    }

    public void aggiungiMensilità(String data,double costo){
        canone.put(data,costo);
    }

    public Map<String, Double> getCanone() {
        return canone;
    }

    public void visualizzaStorico(){
        canone.
    }
}
