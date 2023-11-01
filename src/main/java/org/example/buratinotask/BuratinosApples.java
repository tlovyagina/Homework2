package org.example.buratinotask;

public class BuratinosApples {
    private final int applesCount = 300;
    private final int stolenApplesCount = 100;
    private final int remainingApplesCount = applesCount - stolenApplesCount;

    public int getRemainingApplesCount() {
        return remainingApplesCount;
    }
}