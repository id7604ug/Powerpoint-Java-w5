package com.anthony;

import java.io.*;

// New for reading and writing files

public class Reading {

    public static void main(String[] args) throws IOException {
        // Create a FileReader to handle opening adn closing the file and reading characters
        FileReader reader = new FileReader("hello.txt");
        // BufferedReader combines the characters read into whole lines
        BufferedReader bufReader = new BufferedReader(reader);

        // Read in the first line...
        String line = bufReader.readLine();

        // While loop to loop over lines of  the hello.txt file
        while (line != null) {
            System.out.println(line);

            // And read the next line
            line = bufReader.readLine();
        }
    }
}