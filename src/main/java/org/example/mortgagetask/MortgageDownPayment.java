package org.example.mortgagetask;

public class MortgageDownPayment {
    private final long apartmentCost = 50_000_000;
    private final float mortgageDownPaymentPercentage = 15;
    private final float downPaymentAmount = apartmentCost * mortgageDownPaymentPercentage / 100;

    public float getDownPaymentAmount() {
        return downPaymentAmount;
    }
}