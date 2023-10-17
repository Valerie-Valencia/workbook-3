package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] famousQuotes = {
                "The only person you're destined to become is the person you decide to be.",
                "It does not matter how slowly you go, as long as you do not stop.",
                "Do not let making a living prevent you from making a life.",
                "The way to get started is to quit talking and begin doing.",
                "Success usually comes to those who are too busy to be looking for it.",
                "The only impossible journey is the one you never begin.",
                "No one would have crossed the ocean if he could have gotten off the ship in the storm.",
                "Do not go where the path may lead; go instead where there is no path and leave a trail.",
                "Hard work beats talent when talent doesn't work hard.",
                "I am who I am today because of the choices I made yesterday.",
        };

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Hello, please enter a number from 1-10: ");
            int quoteChoice = scanner.nextInt();
            System.out.println(famousQuotes[quoteChoice]);
        }
        catch(Exception e){
            System.out.println("An exception occurred.");
            e.printStackTrace();
        }
        scanner.close();


    }
}