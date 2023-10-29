package org.example.glasstask;

public class GlassValue {
    private final int glassValueMl = 250;
    private final float glassFillingPercentage = 20;
    private final float actualGlassFilling = glassValueMl * glassFillingPercentage / 100;

    public float getActualGlassFilling() {
        return actualGlassFilling;
    }

    public float getGlassFillingPercentage() {
        return glassFillingPercentage;
    }
}
