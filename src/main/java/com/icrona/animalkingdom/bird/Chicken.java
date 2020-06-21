package com.icrona.animalkingdom.bird;

public class Chicken extends FlightlessBird {

    private final boolean adult;
    private final String sex;

    public Chicken(boolean adult, String sex) {
        this.adult = adult;
        this.sex = sex;
    }

    public String sound() {

        if(adult && isRooster()) {
            return "Cock-a-doodle-do";
        }
        return "Cluck, cluck";
    }

    private boolean isRooster() {
        return sex.equalsIgnoreCase("male");
    }
}
