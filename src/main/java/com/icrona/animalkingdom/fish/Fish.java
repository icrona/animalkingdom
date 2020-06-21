package com.icrona.animalkingdom.fish;

import com.icrona.animalkingdom.Animal;
import com.icrona.animalkingdom.Swimmer;

public class Fish extends Animal implements Swimmer {

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Fish cannot walk");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
