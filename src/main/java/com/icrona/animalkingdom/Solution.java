package com.icrona.animalkingdom;

import com.icrona.animalkingdom.bird.Bird;
import com.icrona.animalkingdom.bird.ChickenFactory;

public class Solution {

    public static void main(String[] args) {

        ChickenFactory chickenFactory = new ChickenFactory();
        Bird bird = chickenFactory.getBird("chicken");
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
