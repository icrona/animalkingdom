package com.icrona.animalkingdom.insect;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ButterflyTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream systemOut = System.out;

    @Test
    void fly() {

        System.setOut(new PrintStream((outContent)));

        Caterpillar caterpillar = new Caterpillar();
        Butterfly butterfly = caterpillar.metamorph();

        butterfly.fly();

        assertEquals("I am flying\n", outContent.toString());
        System.setOut(systemOut);
    }
}
