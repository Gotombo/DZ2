package com.company;

public class Cars implements Printable {
    private int speed;
    private int year;


    public Cars(int speed, int year) {
        this.speed = speed;
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void print() {

    }
}
