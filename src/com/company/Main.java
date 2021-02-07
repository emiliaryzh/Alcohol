package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Spirt.isDrunk);
        Champagne.countBubbles();
        Champagne mySh = new Champagne(12, "Asti");
        Vodka myVod = new Zubrovka(40, "Zybrovka");
        myVod.setGradus(30);
        System.out.println(myVod.getGradus());

        System.out.println(myVod.getGradus());



    }
}



