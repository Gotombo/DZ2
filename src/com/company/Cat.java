package com.company;

public class Cat extends Animal implements Printable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Info: Name "+ getName());

    }

    @Override
    public void makeVoice() {
        System.out.println("Kis Kis");

    }
}
