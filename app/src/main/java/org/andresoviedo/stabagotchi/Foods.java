package org.andresoviedo.stabagotchi;

// This enum contains all the different types of food you can feed the pet. The first value is the
// cost of the food in lv (love points) and the second one is the health it restores in hp.

public enum Foods {

    TREAT("Treat", 10, 5),
    BOWL("Bowl", 20, 10),
    BIGBOWL("Big bowl", 30, 15),
    RIBS("Ribs", 50, 20),
    CHICKEN("Chicken", 75, 30),
    STEAK("Steak", 100, 40);


    private final String prettyNameOfFood;
    private final int costOfFood;
    private final int hpRestoreValue;

    Foods(String prettyNameOfFood, int costOfFood, int hpRestoreValue) {
        this.prettyNameOfFood = prettyNameOfFood;
        this.costOfFood = costOfFood;
        this.hpRestoreValue = hpRestoreValue;
    }

    public String getPrettyNameOfFood() {
        return prettyNameOfFood;
    }

    public int getCostOfFood() {
        return costOfFood;
    }

    public int getHpRestoreValue() {
        return hpRestoreValue;
    }

}
