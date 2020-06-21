package com.icrona.animalkingdom.bird;

public abstract class FlightlessBird extends Bird{

    @Override
    public void fly() {
        throw new UnsupportedOperationException("This kind of bird cannot fly");
    }
}
