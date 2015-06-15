package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalesTaxTest {

    @Test
    public void specToCheckEqualityOfTwoSalesTaxObjects() {
        SalesTax salesTaxOne = new SalesTax(1,"book",45.9,0);
        SalesTax salesTaxTwo = new SalesTax(1,"book",45.9,0);
        assertEquals(salesTaxOne,salesTaxTwo);
    }

    @Test
    public void specToCheckComputeTaxWithZeroTax() {
        SalesTax salesTax = new SalesTax(1,"book",45.9,0);
        salesTax.computeTax();
        assertEquals("1 book 45.9",salesTax.toString());
    }
}