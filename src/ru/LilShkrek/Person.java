package ru.LilShkrek;

public class Person {

    private static int lastId;
    private static int XpPerLvl = 50;
    private String name;
    private double xp;
    private final int id;  //final - можно изменять только в констуркторе

    public Person(String name) {

        this.id = lastId++;

        if(name == null) {

            name = "Person without name # " + id;

        }

        this.name = name;

    }

    public static void setXpPerLvl(int XpPerLvl) {

        if(XpPerLvl <= 0) {

            XpPerLvl = 1;

        }

        Person.XpPerLvl = XpPerLvl;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void addXp(double xp) {

        if(xp < 0) {

            xp = 0;

        }

        this.xp += xp;

    }

    public void deleteXp(double xp) {

        if(xp < 0) {

            xp = 0;

        }

        if(xp > this.xp) {

            xp = this.xp;

        }

        this.xp -= xp;

    }

    public double getXp() {

        return xp;

    }

    public int getLvl() {

        return (int)(xp / XpPerLvl);

    }

    public int getId() {

        return id;

    }
}
