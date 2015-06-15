package com.company;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ParserTest {

    @Test
    public  void specToCheckParserReturnsCorrectSalesTaxObject() {
        SalesTax salesTax = mock(SalesTax.class);
        Parser parser = new Parser();
        salesTax = parser.parser("1 book at 25.9");

        SalesTax expectedSalesTax = new SalesTax(1,"book",25.9 ,0);
        assertEquals(salesTax,expectedSalesTax);
    }
}