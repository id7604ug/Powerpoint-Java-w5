package com.anthony;
import java.io.*;
import java.util.ArrayList;

public class ExceptionHandling { public static void main(String[] args) {
        ArrayList data = new ArrayList();
        data.add("Hello");
        data.add("1234");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (int x = 0 ; x < 2 ; x++) {
                Object dataToWrite = data.get(x);
                writer.write(dataToWrite.toString());
            }
            writer.close();
        }

        catch (IOException ioe) {
            System.out.println("An IO exception was thrown");
            ioe.printStackTrace();
        }

        catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Tried to access non-existent element of ArrayList ");
            ioobe.printStackTrace();
        }

        catch (Exception e) {
            System.out.println("Another type of exception was thrown");
            e.printStackTrace();
        }
    }
}