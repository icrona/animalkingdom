package com.icrona.animalkingdom;

import com.icrona.animalkingdom.bird.Bird;
import com.icrona.animalkingdom.bird.ChickenFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BirdTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream systemOut = System.out;
    private final ChickenFactory chickenFactory = new ChickenFactory();

    @BeforeEach
    void setUpStream(){
        System.setOut(new PrintStream((outContent)));
    }

    @AfterEach
    void restoreStream() {
        System.setOut(systemOut);
    }

    @Test
    void fly() {
        Bird bird = chickenFactory.getBird("chicken");

        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            bird.fly();
        });

        String expectedMessage = "This kind of bird cannot fly";
        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    void sing() {

        Bird bird = chickenFactory.getBird("chicken");
        bird.sing();
        assertEquals("I am singing\n", outContent.toString());
    }
}
