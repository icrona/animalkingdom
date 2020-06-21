package com.icrona.animalkingdom;

import com.icrona.animalkingdom.bird.Bird;
import com.icrona.animalkingdom.bird.Chicken;

public class Solution {

    public static void main(String[] args) {

        Bird bird = new Chicken();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
