package distributore;

import java.util.ArrayList;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public  class Distributore {
    public ArrayList<String[]> file;
    public ArrayList<Elemento> elementi;

    public Distributore(ArrayList<String[]> file) {
        this.elementi = new ArrayList<>();
        this.file=file;
        crealista();
    }

    private void crealista(){
       if (file.get(0).length==3){
            //ho degli snacks
           for(int i=0;i<file.size();i++){
               String[] splittata= file.get(i);
               elementi.add(new Snack(splittata[0],splittata[1],parseDouble(splittata[2])));
           }
       }
       else {
           //ho delle bevande
           for(int i=0;i<file.size();i++){
               String[] splittata= file.get(i);
               elementi.add(new Bevande(splittata[0],parseDouble(splittata[1]),splittata[2],parseDouble(splittata[3])));
           }
       }
    }



}
