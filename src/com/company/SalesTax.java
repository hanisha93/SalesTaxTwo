package com.company;

import java.text.DecimalFormat;

public class SalesTax {
    int noOfItems;
    String item;
    double prize;
    int tax;
    double total;

    public SalesTax(int noOfItems, String item, double prize, int tax,double total) {
        this.noOfItems = noOfItems;
        this.item = item;
        this.prize = prize;
        this.tax = tax;
        this.total=total;
    }

    public void computeTax() {
        double taxDeducted = (tax * prize) / 100;
        taxDeducted = (double) Math.ceil(taxDeducted / 0.05f) * 0.05f;
        DecimalFormat df = new DecimalFormat("#.##");
        df.format(taxDeducted);
        prize += taxDeducted;
        prize = Math.floor(prize * 100) / 100;
        total += prize;
    }

    public double getTotal() {
        return total;
    }
    @Override
    public String toString() {
        return noOfItems + " " + item + " " + prize + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalesTax salesTax = (SalesTax) o;

        if (noOfItems != salesTax.noOfItems) return false;
        if (Double.compare(salesTax.prize, prize) != 0) return false;
        if (tax != salesTax.tax) return false;
        return !(item != null ? !item.equals(salesTax.item) : salesTax.item != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = noOfItems;
        result = 31 * result + (item != null ? item.hashCode() : 0);
        temp = Double.doubleToLongBits(prize);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + tax;
        return result;
    }
}
