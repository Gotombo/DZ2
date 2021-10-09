package com.company;

public class Dog extends Animal implements Printable{
    public Dog(String name ) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Info: Name "+ getName());

    }

    @Override
    public void makeVoice() {
        System.out.println("Gav Gav");

    }

}
