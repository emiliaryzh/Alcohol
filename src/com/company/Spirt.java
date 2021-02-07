package com.company;

public abstract class Spirt {
    int gradus;
    String name;
    static boolean isDrunk = true;

    public Spirt(int gradus, String name) {
        this.gradus = gradus;
        this.name = name;
    }

    abstract void howToPrepare();
}
