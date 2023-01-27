package BankAccountApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args){

       // String file = "/Users/erikkadiev/Downloads/BankApp.txt";



     Checking checking = new Checking("Tom Wilson", "321456879", 1500);
        Savings savings = new Savings("Rich Lowe", "456657897", 2500);
        savings.showInfo();
        System.out.println("*************");
         checking.showInfo();

         //TODO: I have to fix the problem with the file

        // Read a CSV file then create new accounts based on that data
        /*List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder) {
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);} */

    }
}
