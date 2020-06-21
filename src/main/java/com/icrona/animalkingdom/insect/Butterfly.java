package com.icrona.animalkingdom.insect;

import com.icrona.animalkingdom.Animal;
import com.icrona.animalkingdom.Flyable;

public class Butterfly extends Animal implements Flyable {

    public Butterfly(Caterpillar caterpillar) {
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
