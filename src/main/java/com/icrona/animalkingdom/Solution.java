package com.icrona.animalkingdom;

import com.icrona.animalkingdom.bird.*;
import com.icrona.animalkingdom.fish.Shark;
import com.icrona.animalkingdom.insect.Butterfly;
import com.icrona.animalkingdom.insect.Caterpillar;

import java.util.Arrays;
import java.util.function.Predicate;

public class Solution {

    private static final Predicate<Animal> flyableAnimal = animal -> !(animal instanceof FlightlessBird) && animal instanceof Flyable ;

    public static void main(String[] args) {

        ChickenFactory chickenFactory = new ChickenFactory();
        Bird chicken = chickenFactory.getBird("chicken");
        Bird rooster = chickenFactory.getBird("rooster");

        Caterpillar caterpillar = new Caterpillar();
        Butterfly butterfly = caterpillar.metamorph();

        Animal[] animals = new Animal[] {
                chicken,
                rooster,
                new Shark(),
                new Dolphin(),
                caterpillar,
                butterfly,
                new Duck(),
                new Parrot(),
                new Dog()
        };


        long flyingAnimal = countAnimal(animals, flyableAnimal);

        System.out.println(flyingAnimal);
    }

    private static long countAnimal(Animal[] animals, Predicate<Animal> predicate) {

        return Arrays.stream(animals)
                .filter(predicate)
                .count();
    }

}
