package errori;

import java.io.IOException;

public class nessunaDigitata extends IOException {
    public nessunaDigitata(){
        super("Non è stato digitato nulla\n");
    }
}
