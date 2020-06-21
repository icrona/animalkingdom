package com.icrona.animalkingdom.bird;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    private final ChickenFactory chickenFactory = new ChickenFactory();

    @Test
    void chickenSound() {

        Bird chicken = chickenFactory.getBird("chicken");
        assertEquals("Cluck, cluck", chicken.sound());
    }

    @Test
    void roosterSound() {

        Bird chicken = chickenFactory.getBird("rooster");
        assertEquals("Cock-a-doodle-do", chicken.sound());
    }
}
