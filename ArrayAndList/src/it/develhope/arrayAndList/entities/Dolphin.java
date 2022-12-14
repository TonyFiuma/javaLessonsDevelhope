package it.develhope.arrayAndList.entities;

public class Dolphin extends Animal{
    public Dolphin(String name) {
        super(name,"20 km/h",false,true);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin is eating");

    }
}
