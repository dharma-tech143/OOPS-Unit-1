import java.io.InputStream;

public class Keyip {
    public static void main(String[] args) {
        try {
            InputStream in = System.in;

            System.out.print("Enter a character: ");
            int ch = in.read();

            System.out.println("You entered: " + (char) ch);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
