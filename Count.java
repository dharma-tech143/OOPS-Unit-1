import java.io.FileInputStream;

public class Count {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sample.txt");

            int count = 0;
            while (fis.read() != -1) {
                count++;
            }

            System.out.println("Total characters: " + count);

            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
