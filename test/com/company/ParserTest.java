package com.company;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ParserTest {

    @Test
    public void specToCheckParserReturnsSalesTaxForExceptionalItems() {
        SalesTax salesTax = mock(SalesTax.class);
        Parser parser = new Parser();
        salesTax = parser.parser("1 book at 25.9");

        SalesTax expectedSalesTax = new SalesTax(1, "book", 25.9, 0);
        assertEquals(salesTax, expectedSalesTax);
    }

    @Test
    public void specToCheckParserReturnsSalesTaxForExceptionalAndImportedItems() {
        SalesTax salesTax = mock(SalesTax.class);
        Parser parser = new Parser();
        salesTax = parser.parser("1 imported book at 25.9");

        SalesTax expectedSalesTax = new SalesTax(1, "book", 25.9, 5);
        assertEquals(salesTax, expectedSalesTax);
    }

    @Test
    public void specToCheckParserReturnsSalesTaxForNonExceptionalAndImportedItems() {
        SalesTax salesTax = mock(SalesTax.class);
        Parser parser = new Parser();
        salesTax = parser.parser("1 imported music cd at 25.9");

        SalesTax expectedSalesTax = new SalesTax(1, "musiccd", 25.9, 15);
        assertEquals(salesTax, expectedSalesTax);
    }

    @Test
    public void specToCheckParserReturnsSalesTaxForNonExceptionalItems() {
        SalesTax salesTax = mock(SalesTax.class);
        Parser parser = new Parser();
        salesTax = parser.parser("1 music cd at 25.9");

        SalesTax expectedSalesTax = new SalesTax(1, "musiccd", 25.9, 10);
        assertEquals(salesTax, expectedSalesTax);
    }

}