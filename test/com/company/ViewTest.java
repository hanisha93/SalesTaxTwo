package com.company;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.setOut;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        setOut(new PrintStream(outContent));
    }

    @Test
    public void specForCheckingPrintingMessageOnConsole() {
        View view = new View(new Scanner(System.in));
        view.printToConsole("1 chocolate at 9");

        assertEquals("1 chocolate at 9", outContent.toString());
    }

    @Test
    public void specForCheckingReadingInputFromConsole() {

        ByteArrayInputStream inContent = new ByteArrayInputStream("chocolate at 9".getBytes());
        System.setIn(inContent);
        View view = new View(new Scanner(System.in));
        String input = view.readInput();

        assertThat(input, is(equalTo("chocolate at 9")));
    }

    @After
    public void cleanUpStreams() {
        setOut(null);
        System.setIn(System.in);
    }

}