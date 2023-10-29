package org.example.traveltimetask;

public class TravelTime {
    private final short distanceFromHomeToOffice = 10;
    private final float averageTaxiSpeed = 50;
    private final float timeFromHomeToOffice = distanceFromHomeToOffice / averageTaxiSpeed;
    private final float eveningTrafficDecelerationFactor = 1.5F;
    private final float timeFromOfficeToHome = timeFromHomeToOffice * eveningTrafficDecelerationFactor;

    public float getTimeFromOfficeToHome() {
        return timeFromOfficeToHome;
    }
}
