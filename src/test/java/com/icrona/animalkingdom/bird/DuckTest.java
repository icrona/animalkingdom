package com.icrona.animalkingdom.bird;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    void sound() {

        Duck duck = new Duck();
        assertEquals("Quack, quack", duck.sound());
    }
}
