package org.example;

import org.example.buratinotask.BuratinosApples;
import org.example.employeescounttask.EmployeesCalculator;
import org.example.sarumantask.Armies;

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
    }
}
