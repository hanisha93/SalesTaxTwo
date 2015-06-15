package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listOfItems = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        View view = new View(scanner);
        Parser parser = new Parser();
        Controller cont = new Controller(view, parser, listOfItems);
        cont.start();

    }
}
