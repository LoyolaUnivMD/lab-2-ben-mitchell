// Programmers:  Michele & Ben
// Course:  CS 212
// Due Date: 02/04/2024
// Lab Assignment: 2
// Problem Statement:  write a program and generate lottery tickets for players
// Data In: player's name
// Data Out: Random ticket numbers
// Credits: None

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;


class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");

        String customerName = input.nextLine();

        System.out.println("Here are the ticket:");
        DecimalFormat df = new DecimalFormat();
        Random rand = new Random();

        // use a for loop for the number of rows
        for(int i=0; i<10; i++) {
        // use a for loop to print out 6 numbers in each row
            for(int j=0; j<6; j++) {
                System.out.print(String.format("%02d",rand.nextInt(99)) + " " );
            }
            System.out.println();
        }
        // Say goodbye to the user
        System.out.println("-------------");
        System.out.println("Good luck " + customerName);
        System.out.println("Estimated Jackpot:");
        System.out.println("$" + "225,938,745");
        System.out.println("-------------");

    }
}
