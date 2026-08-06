import java.io.ByteArrayInputStream;

public class ByteArray{
    public static void main(String[] args) {
        String text = "Hello Java";

        ByteArrayInputStream bis = new ByteArrayInputStream(text.getBytes());

        int data;
        while ((data = bis.read()) != -1) {
            System.out.print((char) data);
        }
    }
}

