package chapter12;

import java.io.*;

class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    public static void readFile() throws IOException {
        FileReader file = new FileReader("non_existing_file.txt");
        file.read();
        file.close();
    }

}
