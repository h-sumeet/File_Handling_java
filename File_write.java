package File_Handling_java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_write {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, world!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

