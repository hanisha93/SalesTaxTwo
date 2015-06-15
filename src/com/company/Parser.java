package com.company;

public class Parser {

    public SalesTax parse(String input) {
        String item = "";
        boolean imported = false;
        String tokens[] = input.split(" ");
        int noOfItems = Integer.parseInt(tokens[0]);
        if (tokens[1].equals("imported")) {
            imported = true;
            for (int i = 2; !tokens[i].equals("at"); i++) {
                item += tokens[i];
            }
        } else {
            imported = false;
            for (int i = 1; !tokens[i].equals("at"); i++) {
                item += tokens[i];
            }
        }

        double prize = Double.parseDouble(tokens[tokens.length - 1]);
        if (((item.equals("chocolate")) || (item.equals("book")) || (item.equals("medicine"))) && (imported)) {
            return new SalesTax(noOfItems, item, prize, 5);
        } else if (((item.equals("chocolate")) || (item.equals("book")) || (item.equals("medicine"))) && (!imported)) {
            return new SalesTax(noOfItems, item, prize, 0);
        } else if (!imported) {
            return new SalesTax(noOfItems, item, prize, 10);
        } else {
            return new SalesTax(noOfItems, item, prize, 15);
        }
    }
}
