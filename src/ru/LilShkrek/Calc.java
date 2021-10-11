package ru.LilShkrek;

public class Calc {

    private int current = 0;

    public Calc(){



    }

    public Calc(int startValue) {

        current = startValue;
        System.out.println("Salam");

    }

    public int sum(int arg) {

        current += arg;
        return current;

    }

    public int getCurrent() {

        return current;

    }

}
