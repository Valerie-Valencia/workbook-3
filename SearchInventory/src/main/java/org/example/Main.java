package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        ArrayList<Product> inventory = readInventory();
        System.out.println(inventory);

        inventory.sort((o1, o2) -> o1.getProductId() - o2.getProductId());

        for (Product p : inventory) {
           System.out.println(p.getProductId() + " " + p.getProductName() + " " + p.getProductPrice());
        }

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "book", 13.92));
        products.add(new Product(2, "bookmark", 13.92));
        products.add(new Product(3, "dust jacket", 13.92));
        products.add(new Product(4, "book lamp", 13.92));
        products.add(new Product(5, "book poster", 13.92));

        return products;
    }

    public static ArrayList<Product> readInventory() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            FileReader filereader = new FileReader("products.csv");
            BufferedReader bufferedReader = new BufferedReader(filereader);
            String input = null;
            while ((input = bufferedReader.readLine()) != null) {
                String[] fields = input.split(",");
                var id = Integer.parseInt(fields[0]);
                var name = fields[1].trim();
                var price = Double.parseDouble(fields[2]);
                Product p = new Product(id, name, price);
                products.add(p);
            }
            bufferedReader.close();
        } catch(FileNotFoundException e){
            throw new RuntimeException(e);
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        return products;
    }
}