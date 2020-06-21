package com.icrona.animalkingdom.bird;

import com.icrona.animalkingdom.Animal;
import com.icrona.animalkingdom.SoundableAnimal;

public class Parrot extends Bird {

    private Animal liveWith;

    public Parrot() {
    }

    public Parrot(Animal liveWith) {
        this.liveWith = liveWith;
    }

    @Override
    public String sound() {

        if (liveWith != null && liveWith instanceof SoundableAnimal) {
            return ((SoundableAnimal) liveWith).sound();
        }
        return "squawk";
    }
}
