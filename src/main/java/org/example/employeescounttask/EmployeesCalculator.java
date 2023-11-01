package org.example.employeescounttask;

public class EmployeesCalculator {
    private final int developersCount = 10;
    private final int testersPerDevelopersCount = 1;
    private final int supportsPerDevelopersCount = 2;
    private final int testersTotalCount = developersCount * testersPerDevelopersCount;
    private final int supportTotalCount = developersCount * supportsPerDevelopersCount;
    private final int totalEmployeesCount = developersCount + testersTotalCount + supportTotalCount;

    public int getTestersTotalCount() {
        return testersTotalCount;
    }

    public int getSupportTotalCount() {
        return supportTotalCount;
    }

    public int getTotalEmployeesCount() {
        return totalEmployeesCount;
    }
}