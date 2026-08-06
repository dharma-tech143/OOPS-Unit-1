import java.io.FileInputStream;

public class File{
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sample.txt");

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}