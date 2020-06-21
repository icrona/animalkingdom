package com.icrona.animalkingdom.insect;

import com.icrona.animalkingdom.Animal;

public class Caterpillar extends Animal {

    public Butterfly metamorph() {
        return new Butterfly(this);
    }
}
