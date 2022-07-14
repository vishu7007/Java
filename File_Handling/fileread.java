package File_Handling;

import java.io.*;
import java.nio.file.attribute.*;

public class fileread {
    public static void main(String[] args) {
        try {
            File f = new File("file.txt");
            if (f.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("Paaji file nai haigii");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}

// Stream is bigger buffer size to read a file but it cannot read large file
// upto 1GB
// Chunks is smaller buffer size and it can read a file larger than 10GB