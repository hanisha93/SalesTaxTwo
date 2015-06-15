package com.company;

import java.util.Scanner;

public class View {

    private Scanner scanner;

    public View(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printToConsole(String output) {
        System.out.print(output);
    }

    public String readInput() {
        return scanner.nextLine();
    }
}
