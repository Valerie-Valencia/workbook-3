package org.example;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Bedtime Stories! Please choose a bedtime story\n" +
                "(A) Goldilocks\n" +
                "(B) Hansel and Gretel\n" +
                "(C) Mary had a Little Lamb\n");

        String storyChoice = scanner.nextLine().toUpperCase();
        String storyFile = "NULL";

       // String story1 = new FileInputStream(storyFile);

        /*try{
            String storyChoice = scanner.nextLine();
            FileReader readStory = new FileReader(storyChoice);
        }catch (Exception e){
            System.out.println("Sorry! Didn't quite understand that.");
           e.printStackTrace();
            //Break;
        }*/

        /*swtich(storyChoice){
            case 'A':
                System.out.println("Goldilocks");
                f1 = new FileInputStream("Goldilocks.text");
                system.out.println(f1);
                Break;
            case 'B:
                //code
                Break;
            case 'C':
                //code
                Break;
        }*/


    }
}