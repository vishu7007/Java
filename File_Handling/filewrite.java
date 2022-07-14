package File_Handling;

import java.io.*;

public class filewrite {
    public static void main(String[] args) {
        try {
            FileWriter f1 = new FileWriter("file1.txt");
            f1.write("HEllo");
            f1.close();
            System.out.println("File created successfully");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}

// Stream is bigger buffer size to read a file but it cannot read large file
// upto 1GB
// Chunks is smaller buffer size and it can read a file larger than 10GB