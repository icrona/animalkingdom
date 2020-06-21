package com.icrona.animalkingdom.fish;

import com.icrona.animalkingdom.Swimmer;
import com.icrona.animalkingdom.WalklessAnimal;

public class Fish extends WalklessAnimal implements Swimmer {

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
