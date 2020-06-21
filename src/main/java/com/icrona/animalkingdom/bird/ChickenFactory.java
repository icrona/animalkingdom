package com.icrona.animalkingdom.bird;

public class ChickenFactory {

    public Chicken getBird(String chicken) {
        if (chicken == null) {
            return null;
        }
        if(chicken.equalsIgnoreCase("rooster")) {
            return new Chicken(true, "male");
        }
        if(chicken.equalsIgnoreCase("chicken")) {
            return new Chicken(false, null);
        }
        return null;
    }
}
