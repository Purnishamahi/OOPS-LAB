import java.io.FileWriter;
import java.io.IOException;

public class Finally {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file.");
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
    }
}
