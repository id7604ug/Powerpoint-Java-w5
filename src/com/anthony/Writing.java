package com.anthony;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

// New for reading and writing files
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {

    public static void main(String[] args) throws IOException {
        // Create and open hello.txt for writing
        FileWriter writer = new FileWriter("hello.txt");
        // Wrap FileWriter in BufferedWriter
        BufferedWriter bufWriter = new BufferedWriter(writer);

        // Writes strings to the file
        bufWriter.write("Hello\n");
        bufWriter.write("Data here\n");
        bufWriter.write("Goodbye\n");

        // Closes the file *Always close files when done writing
        // Closes BufferedWriter, FileWriter and the file
        bufWriter.close();

        // Slide 11
        // Create FileWrite in append mode
        writer = new FileWriter("hello.txt", true);
        // Wrap FileWriter in BufferedWriter
        bufWriter = new BufferedWriter(writer);

        // This will be added to the end of the existing file
        bufWriter.write("This data\n");
        bufWriter.write("is appended to the end of the first set of data.\n");

        // Close file
        bufWriter.close();

    }
}
