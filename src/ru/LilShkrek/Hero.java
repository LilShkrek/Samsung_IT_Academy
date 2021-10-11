package ru.LilShkrek;

public class Hero {

    private String name;

    public Hero(String name) {

        this.name = name;

    }

    public Hero(){}


    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public String speak() {

        return "Я устал";

    }



}
