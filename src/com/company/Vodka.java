package com.company;

public abstract class Vodka extends Spirt {
    private int gradus;
    private String name;

    public Vodka(int gradus, String name) {
        super(gradus, name);
        System.out.println("hello");
    }

    public int getGradus() {
        return gradus;
    }

    public void setGradus(int gradus) {
        if (gradus < 40) {
            System.out.println("Fuuuu");
            this.gradus = -1;
        }
        else{
        this.gradus = gradus;}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
