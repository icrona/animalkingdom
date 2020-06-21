package com.icrona.animalkingdom.fish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharkTest {

    @Test
    void eatFish() {

        Fish clownfish = new Clownfish();

        Shark shark = new Shark();

        shark.eatFish(clownfish);
    }

    @Test
    void eatShark() {

        Shark shark1 = new Shark();
        Shark shark2 = new Shark();

        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            shark1.eatFish(shark2);
        });

        String expectedMessage = "Shark only can eat other fish";
        assertEquals(expectedMessage, exception.getMessage());
    }
}
