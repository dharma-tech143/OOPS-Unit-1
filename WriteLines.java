import java.io.FileOutputStream;
import java.io.IOException;

public class WriteLines {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("student.txt");

            String data = "Name: Rahul\nAge: 20\nCourse: BCA";
            out.write(data.getBytes());

            out.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}