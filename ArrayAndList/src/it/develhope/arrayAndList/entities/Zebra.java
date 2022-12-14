package it.develhope.arrayAndList.entities;

public class Zebra extends Animal{
    public Zebra(String name) {
        super(name,"20 km/h",false,true);
    }

    @Override
    public void eat() {
        System.out.println("Zebra is eating");

    }
}
