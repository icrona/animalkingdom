package com.icrona.animalkingdom.bird;

import com.icrona.animalkingdom.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTest {

    @Test
    void sound() {

        Parrot parrot = new Parrot();
        assertEquals("squawk", parrot.sound());
    }

    @Test
    void soundLiveWithOtherAnimal() {
        Dog dog = new Dog();
        Parrot parrot = new Parrot(dog);
        assertEquals(dog.sound(), parrot.sound());
    }
}
