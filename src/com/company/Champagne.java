package com.company;

public class Champagne extends Spirt {

    @Override
    void howToPrepare() {

    }

    public Champagne(int gradus, String name) {
        super(gradus,name);
        System.out.println("hello");
    }
    static void countBubbles(){
        System.out.println("One billion bubbles");
    }

}
