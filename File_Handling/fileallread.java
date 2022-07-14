package File_Handling;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

public class fileallread {
    public static void main(String[] args) {
        Path filePath = Paths.get("file.txt");
        Charset charset = StandardCharsets.UTF_8;
        try {
            List<String> lines = Files.readAllLines(filePath, charset);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.format("I/O error: %s%n", ex);
        }
    }
}
