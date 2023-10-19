package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.String;
//import java.io.*;

public class Main {

    public static void main(String[] args) {

        String delimiter = "\\|";

        try{

            String input = null;
            FileReader filereader = new FileReader("employees.cvs");
            BufferedReader bufferedreader = new BufferedReader(filereader);
            bufferedreader.readLine();

            while((input = bufferedreader.readLine()) != null){
                String[] tokens = input.split(delimiter);
                System.out.println("\n" + tokens[0]);
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee e = new Employee(id, name, hoursWorked, payRate);git status
                System.out.println(e);

            }

            bufferedreader.close();
        }
        catch(Exception e){
            System.out.println("Sorry, I didn't quite understand.");
            e.printStackTrace();
        }
    }
}