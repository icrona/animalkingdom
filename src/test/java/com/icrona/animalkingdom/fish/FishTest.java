package com.icrona.animalkingdom.fish;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FishTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream systemOut = System.out;


    @Test
    void walk() {

        Fish fish = new Shark();

        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            fish.walk();
        });

        String expectedMessage = "Fish cannot walk";
        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    void swim() {

        System.setOut(new PrintStream((outContent)));
        Fish fish = new Clownfish();
        fish.swim();

        assertEquals("Fish is swimming\n", outContent.toString());
        System.setOut(systemOut);
    }
}
