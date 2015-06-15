package com.company;

public class SalesTax {
    int noOfItems;
    String item;
    double prize;
    int tax;

    public SalesTax(int noOfItems, String item, double prize, int tax) {
        this.noOfItems = noOfItems;
        this.item = item;
        this.prize = prize;
        this.tax = tax;
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
