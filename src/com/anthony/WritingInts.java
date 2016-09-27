package com.anthony;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

// New for reading and writing files

public class WritingInts {

    public static void main(String[] args) throws IOException {
        // Create and open the numbers.txt file
        FileWriter writer = new FileWriter("numbers.txt");
        // Wrap the FileWriter in BufferedWriter
        BufferedWriter bufWriter = new BufferedWriter(writer);
        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        // This writes characters using their ascii int values or "CAT"
        bufWriter.write(data1);
        bufWriter.write(data2);
        bufWriter.write(data3);
        // Prints a dividing line
        bufWriter.write("\n");
        // This writes the character values for each integer to the file
        bufWriter.write(Integer.toString(data1));
        bufWriter.write(Integer.toString(data2));
        bufWriter.write(Integer.toString(data3));

        bufWriter.close();

    }
}
