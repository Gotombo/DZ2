package com.company;

public class Bmw extends Cars implements Printable{
    public Bmw(int speed, int year) {
        super(speed, year);
    }

    @Override
    public void print() {
        System.out.println("Скорость: " + getSpeed()+" Год выпуска: " +getYear());
    }
}
