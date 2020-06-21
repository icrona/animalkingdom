package com.icrona.animalkingdom.fish;

public class Shark extends Fish {

    public Shark() {
        super("large", "grey");
    }

    public void eatFish(Fish fish) {
        if(fish instanceof Shark) {
            throw new UnsupportedOperationException("Shark only can eat other fish");
        }

        System.out.println("eat fish");
    }
}
