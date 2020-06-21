package com.icrona.animalkingdom.bird;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    @Test
    void sound() {

        Chicken chicken = new Chicken();
        assertEquals("Cluck, cluck", chicken.sound());
    }
}
