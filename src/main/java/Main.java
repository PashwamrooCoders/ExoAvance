import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/main/resources/fichier.txt");
            fileReader.read();
            new SimpleDateFormat().parse("");
            System.out.println("Hello");
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);

        }
    }


}
