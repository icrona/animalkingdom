package com.icrona.animalkingdom.bird;

import com.icrona.animalkingdom.Swimmer;

public class Duck extends Bird implements Swimmer {

    public String sound() {
        return "Quack, quack";
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
