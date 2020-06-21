package com.icrona.animalkingdom;

public class Dolphin extends WalklessAnimal implements Swimmer {

    @Override
    public void swim() {
        System.out.println("Dolphin is swimming");
    }
}

