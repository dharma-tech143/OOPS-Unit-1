import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytes {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("numbers.txt");

            byte[] numbers = {65, 66, 67, 68, 69};

            out.write(numbers);

            out.close();
            System.out.println("Bytes written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    

