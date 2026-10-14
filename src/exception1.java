import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exception1 {
    public static void main(String[] args) {

        try {
            FileReader obj = new FileReader("src/demo.txt");

            int ch;
            while ((ch = obj.read()) != -1) {
                System.out.print((char) ch);
            }

            obj.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}