package org.example;

import org.example.buratinotask.BuratinosApples;
import org.example.discountonshirtstask.DiscountsOnShirtsCalculator;
import org.example.employeescounttask.EmployeesCalculator;
import org.example.glasstask.GlassValue;
import org.example.mortgagetask.MortgageDownPayment;
import org.example.sarumantask.Armies;
import org.example.traveltimetask.TravelTime;
import org.example.universeagetask.UniverseAge;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        BuratinosApples buratinosApples = new BuratinosApples();
        System.out.println("У Буратино осталось " + buratinosApples.getRemainingApplesCount() + " яблок");
        System.out.println();

        Armies armies = new Armies();
        System.out.println("Общее количество пехоты в союзе Ланнистеров и Сарумана: " + armies.getTotalUnitsCount());
        System.out.println();

        EmployeesCalculator employeesCalculator = new EmployeesCalculator();
        System.out.println("Количество тестировщиков, требуемое на проекте: " + employeesCalculator.getTestersTotalCount());
        System.out.println("Количество специалистов поддержки, требуемое на проекте: " + employeesCalculator.getSupportTotalCount());
        System.out.println("Общее количество технических специалистов на проекте: " + employeesCalculator.getTotalEmployeesCount());
        System.out.println();

        GlassValue glassValue = new GlassValue();
        System.out.println("Количество миллилитров воды в стакане, заполненном на " + glassValue.getGlassFillingPercentage() + "%: " + glassValue.getActualGlassFilling() + "мл");
        System.out.println();

        UniverseAge universeAge = new UniverseAge();
        System.out.println("Вселенная старше людей в " + universeAge.getUniverseOlderThanHumanityTimes() + " раз");
        System.out.println();

        MortgageDownPayment mortgageDownPayment = new MortgageDownPayment();
        System.out.println("Сумма первоначального взноса по ипотеке: " + mortgageDownPayment.getDownPaymentAmount());
        System.out.println();

        TravelTime travelTime = new TravelTime();
        System.out.println("Время, за которое тестировщик добирается вечером на такси с работы домой: " + travelTime.getTimeFromOfficeToHome() + "ч");
        System.out.println();

        DiscountsOnShirtsCalculator discountsOnShirtsCalculator = new DiscountsOnShirtsCalculator();
        System.out.println("Количество рубашек, которые надо добавить к купленным, чтобы получить скидку: " + discountsOnShirtsCalculator.getAddShirtsForDiscountCount());
        System.out.println("Общая цена уже выбранных рубашек без скидки: " + discountsOnShirtsCalculator.getTotalPriceShirtsWithoutDiscount());
        System.out.println("Общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку: " + discountsOnShirtsCalculator.getTotalPriceAddShirtsForDiscount());
        System.out.println("Цена всех рубашек со скидкой: " + discountsOnShirtsCalculator.getDiscountedPricesForAllShirts());
        System.out.println("Цена одной рубашки со скидкой: " + discountsOnShirtsCalculator.getDiscountedPriceForOneShirt());
        System.out.println("Количество сэкономленных денег, если рубашки куплены со скидкой: " + discountsOnShirtsCalculator.getAmountMoneySaved());
        System.out.println("Количество рубашек, которые из-за скидки считай получены на халяву: " + discountsOnShirtsCalculator.getFreeShirtCount());

    }
}
