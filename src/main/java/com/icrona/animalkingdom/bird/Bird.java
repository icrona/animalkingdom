package com.icrona.animalkingdom.bird;

import com.icrona.animalkingdom.Animal;

public abstract class Bird extends Animal {

    public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println(("I am singing"));
    }

    public abstract String sound();
}
