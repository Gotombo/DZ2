package com.company;

import javax.lang.model.element.Name;

public class Main {

    public static void main(String[] args) {




    {


        Audi audi = new Audi(100, 2001);
        Toyota toyota = new Toyota(120, 2003);
        Bmw bmw = new Bmw(200, 2006);

        Dog dog = new Dog("VOVA");
        Cat cat = new Cat("VASYA");

        Printable[] print = {audi, toyota, bmw,dog,cat};

        for (Printable printable : print) {
            if (printable instanceof Cars) {
                System.out.println("Даныые машины: " +" Speed: " +((Cars) printable).getSpeed() + " Year: " + ((Cars) printable).getYear());
            }
            if (printable instanceof Animal) {
                ((Animal) printable).makeVoice();
            }
            printable.print();
        }


    }

}
    }