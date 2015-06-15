package com.company;

import java.util.ArrayList;

public class Controller {
    private View view;
    private Parser parser;
    private ArrayList<String> listOfItems;
    public Controller(View view, Parser parser,ArrayList<String> listOfItems) {
        this.parser = parser;
        this.view = view;
    }

    public void start() {
        String input = "";
        while (!input.equals("0")) {
            input = view.readInput();
            SalesTax salesTax = parser.parse(input);
            salesTax.computeTax();
            listOfItems.add(salesTax.toString());
        }
        for(String eachItem:listOfItems) {
            view.printToConsole(eachItem);
        }
    }
}
