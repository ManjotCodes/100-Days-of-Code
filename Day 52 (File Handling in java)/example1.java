import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class example1 {
    public static void main(String[] args) throws IOException {
        File myfile = new File("textfile.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
        }
    }
}
