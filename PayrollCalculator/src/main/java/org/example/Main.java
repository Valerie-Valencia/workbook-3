package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.String;
import java.util.Scanner;
//import java.io.*;

public class Main {

    public static void main(String[] args) {

        String delimiter = "\\|";
        Scanner scanner = new Scanner(System.in);

        try{
            boolean done = false;
            while(!done){
                System.out.println("Enter the name of the file employee file to process: ");
                String fileName = scanner.nextLine(); // employees.csv

                if(fileName.equals("employees.csv")){
                    System.out.println("Enter the name of the payroll file to create: ");
                    String payrollFileName = scanner.nextLine();
                    FileWriter filewriter = new FileWriter(payrollFileName);
                    BufferedWriter bufferedwriter = new BufferedWriter(filewriter);

                    String input = null;
                    FileReader filereader = new FileReader("employees.csv");
                    BufferedReader bufferedreader = new BufferedReader(filereader);
                    bufferedreader.readLine();

                    while((input = bufferedreader.readLine()) != null){
                        String[] tokens = input.split(delimiter);
                        System.out.println("\n" + tokens[0]);
                        int id = Integer.parseInt(tokens[0]);
                        String name = tokens[1];
                        double hoursWorked = Double.parseDouble(tokens[2]);
                        double payRate = Double.parseDouble(tokens[3]);

                        Employee e = new Employee(id, name, hoursWorked, payRate);
                        System.out.println(e);

                        String output;
                        output = String.format("%d|%s|%.2f\n", e.getId(), e.getName(), e.getGrossPay());
                        bufferedwriter.write(output);

                    }
                    bufferedreader.close();
                    bufferedwriter.close();
                    done = true;
                }
                else{
                    System.out.println("File name not found");
                }
            }
        }
        catch(Exception e){
                System.out.println("Sorry, I didn't quite understand.");
                e.printStackTrace();
        }
    }
}