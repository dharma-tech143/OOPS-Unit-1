import java.io.FileOutputStream;
import java.io.IOException;

public class WriteString {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("output.txt");

            String text = "Hello Java!";
            out.write(text.getBytes());

            out.close();
            System.out.println("String written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}