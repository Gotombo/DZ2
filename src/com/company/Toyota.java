package com.company;

public class Toyota extends Cars implements Printable{
    public Toyota(int speed, int year) {
        super(speed, year);
    }

    @Override
    public void print() {
        System.out.println("Скорость: " + getSpeed()+" Год выпуска: " +getYear());
    }
}
