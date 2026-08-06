import java.io.FileInputStream;

public class Byte {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sample.txt");

            byte[] b = new byte[10];
            fis.read(b);

            System.out.println(new String(b));

            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
