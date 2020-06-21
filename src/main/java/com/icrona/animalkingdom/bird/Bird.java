package com.icrona.animalkingdom.bird;

import com.icrona.animalkingdom.Animal;
import com.icrona.animalkingdom.SoundableAnimal;

public abstract class Bird extends Animal implements SoundableAnimal {

    public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println(("I am singing"));
    }

}
