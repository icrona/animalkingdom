package com.icrona.animalkingdom.bird;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream systemOut = System.out;

    @Test
    void sound() {

        Duck duck = new Duck();
        assertEquals("Quack, quack", duck.sound());
    }

    @Test
    void swim() {

        System.setOut(new PrintStream((outContent)));
        Duck duck = new Duck();
        duck.swim();

        assertEquals("Duck is swimming\n", outContent.toString());
        System.setOut(systemOut);
    }
}
