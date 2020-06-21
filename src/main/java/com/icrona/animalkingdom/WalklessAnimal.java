package com.icrona.animalkingdom;

public class WalklessAnimal extends Animal{

    @Override
    public void walk() {
        throw new UnsupportedOperationException("This animal cannot walk");
    }
}
