import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo{

    private File doc;

    public Archivo(String nombreA){
        doc = new File(nombreA);
        try {
            doc.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     * @param line
     * Metodo que crea un archivo
     */
    public void NewArchivo(String line){
        try {
            FileWriter creator = new FileWriter(doc);
            creator.write(line);
            creator.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    /**
     * @return ArrayList<String>
     * Metodo que lee un archivo y lo pasa a un ArrayList
     */
    public ArrayList<String> ReadArchivo(){
        Scanner rd;
        ArrayList<String> numeros = new ArrayList<String>();
        try {
            rd = new Scanner(doc);
            while(rd.hasNextLine()){
                numeros.add(rd.nextLine());
            }            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return numeros;
    }
}