package ru.LilShkrek;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hero h4 = new AlyansHero("Первый");
        Hero h5 = new OrdaHero("Второй");
        Hero h6 = new NezitHero("Третий");

        System.out.println(h4.speak());
        System.out.println(h5.speak());
        System.out.println(h6.speak());

    }

    private static void workWithPeople() {
        Person[] people = {

            new Person("TY"),
            new Person(null),
            new Person(null)

        };

        Random rnd = new Random(100500);

        for (Person person : people) {

            person.addXp(rnd.nextDouble() * 500);

        }

        for (Person person : people) {

            System.out.println(person.getId() + " " + person.getName());

        }

        Person.setXpPerLvl(0);
        printInfo(people);
    }

    private static void printInfo(Person[] people) {

        for (Person person : people) {

            System.out.println(

                    person.getId() + " " +
                    person.getName() + " " +
                    person.getLvl()

            );

        }

    }

    private static void settingXp() {
        Person p = new Person("aboba");
        p.setName("BU");
        System.out.println(p.getName());
        p.addXp(1337);
        System.out.println(p.getLvl());
        p.deleteXp(322);
        System.out.println(p.getLvl());
    }

    private static void workWithCalc() {
        Calc calc1 = new Calc();
        System.out.println(calc1.sum(3));
        System.out.println(calc1.sum(-8));
        Calc calc2 = new Calc();
        System.out.println(calc2.sum(-8));
        calc2 = calc1;
        System.out.println(calc2.sum(0));
        System.out.println(calc2.getCurrent());
    }

}
