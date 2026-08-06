import java.io.FileOutputStream;
import java.io.IOException;

public class WriteCharacter {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("output.txt");

            out.write('A');

            out.close();
            System.out.println("Character written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}