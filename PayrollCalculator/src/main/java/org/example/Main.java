package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.String;
//import java.io.*;

public class Main {

    public static void main(String[] args) {

        String delimiter = "|";

        try{

            String input = null;
            FileReader filereader = new FileReader("employees.cvs");
            BufferedReader bufferedreader = new BufferedReader(filereader);
            bufferedreader.readLine();

            while((input = bufferedreader.readLine()) != null){
                String[] tokens = input.split(delimiter);
                //Employee[] employee = new Employee();
                System.out.println("\n" + tokens[0]);
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);
                //System.out.printf("id: %d, name: %s, payRate: %f",employee.getEmployeeId());
                //System.out.println("{" + employee.getId() + ", " + employee.getName() + ", " +
                       //employee.getHoursWorked() + ", " + employee.getPayRate() + "}");

                System.out.println(employee);
            }

            bufferedreader.close();
        }
        catch(Exception e){
            System.out.println("Sorry, I didn't quite understand.");
            e.printStackTrace();
        }
    }
}