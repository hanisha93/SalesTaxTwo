package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        View view = new View(scanner);


            String input = view.readInput();
            Parser parser = new Parser();
            SalesTax salesTax = parser.parse(input);
            salesTax.computeTax();
            view.printToConsole(salesTax.toString());

    }
}
