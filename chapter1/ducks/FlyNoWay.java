package ducks;

import ducks.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't flay.");
    }
}
