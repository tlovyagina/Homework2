package org.example.universeagetask;

public class UniverseAge {
    private final long universeAge = 13_000_000_000L;
    private final int humanSpeciesAge = 100_000;
    private final long universeOlderThanHumanityTimes = universeAge / humanSpeciesAge;

    public long getUniverseOlderThanHumanityTimes() {
        return universeOlderThanHumanityTimes;
    }
}
