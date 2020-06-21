package com.icrona.animalkingdom.fish;

import com.icrona.animalkingdom.Animal;
import com.icrona.animalkingdom.Swimmer;

public class Fish extends Animal implements Swimmer {

    private String size;

    private String color;

    public Fish(String size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Fish cannot walk");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
