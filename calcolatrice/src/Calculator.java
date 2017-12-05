public class Calculator {


    public int parse(String text) {
        int numebers = text.split(",").length;
        int index = 0;
        int sum = 0;
        if (text != "") {
            do {
                try {
                    sum = sum + Integer.parseInt(text.split(",")[index]);
                }
                catch(NumberFormatException notANumber){ //se e'  un altro errore non viene skippato
                    sum=sum+getNumber(text.split(",")[index]);
                }
                index++;
            } while (index < numebers);
        }
        return sum;
    }

    private int getNumber(String text){
        String numbers=null;
        text=text.toUpperCase();;
        for(int i=0; i< text.length(); i++){
            numbers.concat(();
        }

    }
}
