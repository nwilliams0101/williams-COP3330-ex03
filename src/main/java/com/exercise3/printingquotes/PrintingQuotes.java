package com.exercise3.printingquotes;
import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args) {
        String quote;
        String author;
        
        System.out.println("What is the quote?");
        
        Scanner input = new Scanner(System.in);
        quote = input.nextLine();
        
        System.out.println("Who said it?");
        author = input.nextLine();

        System.out.println(author + " says, \"" + quote + ".\"");

    }
}
