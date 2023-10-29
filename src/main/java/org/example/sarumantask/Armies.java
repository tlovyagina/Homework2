package org.example.sarumantask;

public class Armies {
    private final int lannistersUnitCount = 1000;
    private final int sarumanOrksCount = 1500;
    private final long totalUnitsCount = lannistersUnitCount + sarumanOrksCount;

    public long getTotalUnitsCount() {
        return totalUnitsCount;
    }
}
