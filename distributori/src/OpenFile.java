import errori.*;
import java.io.*;
import java.util.ArrayList;

public class OpenFile {
    private String nome_file;
    private BufferedReader lettore;
    private FileReader file;
    private ArrayList<String[]> fileaperto;

    public OpenFile(){
        this.nome_file = null;
        this.lettore=null;
        this.file = null;
        this.fileaperto=new ArrayList<>();

    }

    public String tastiera()  {
        System.out.println("Scrivere il nome del file da aprire");
        InputStreamReader keyboard=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(keyboard);
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            new nessunaDigitata();
        }
        return null;
    }

    public void apriFile(){
        try {
            nome_file=tastiera();
            file= new FileReader(nome_file);
        } catch (FileNotFoundException e) {
            new fileNullo();
        }
        lettore=new BufferedReader(file);
        try {
            splitFile();
        } catch (errori.fileNullo fileNullo) {
            fileNullo.printStackTrace();
        }


    }

    public void splitFile() throws fileNullo {
        try{
            String letta;
            while ((letta=lettore.readLine())!=null){
                String[] splittata=letta.split("\t");
                fileaperto.add(splittata);
            }
        }catch (Exception e){
            throw new fileNullo();
        }
    }

}
