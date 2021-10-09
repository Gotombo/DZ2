package com.company;

public class Audi extends Cars implements Printable{
    public Audi(int speed, int year) {
        super(speed, year);
    }

    @Override
    public void print() {
        System.out.println("Скорость: " + getSpeed()+" Год выпуска: " +getYear());

    }

}
