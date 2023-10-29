package org.example.discountonshirtstask;

public class DiscountsOnShirtsCalculator {
    private final int priceOneShirtWithoutDiscount = 10000;
    private final short shirtsAlreadySelectedCount = 5;
    private final short shirtForDiscountCount = 10;
    private final short addShirtsForDiscountCount = shirtForDiscountCount - shirtsAlreadySelectedCount;
    private final int totalPriceShirtsWithoutDiscount = priceOneShirtWithoutDiscount * shirtsAlreadySelectedCount;
    private final int totalPriceAddShirtsForDiscount = priceOneShirtWithoutDiscount * addShirtsForDiscountCount;
    private final float discountPercentage = 50;
    private final float discountedPricesForAllShirts = (totalPriceShirtsWithoutDiscount + totalPriceAddShirtsForDiscount) * discountPercentage / 100;
    private final float discountedPriceForOneShirt = discountedPricesForAllShirts / shirtForDiscountCount;
    private final float amountMoneySaved = totalPriceShirtsWithoutDiscount + totalPriceAddShirtsForDiscount - discountedPricesForAllShirts;
    private final float freeShirtCount = amountMoneySaved / priceOneShirtWithoutDiscount;

}
