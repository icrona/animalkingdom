package com.icrona.animalkingdom;

public class Dog extends Animal implements SoundableAnimal {

    @Override
    public String sound() {
        return "Woof, woof";
    }
}
