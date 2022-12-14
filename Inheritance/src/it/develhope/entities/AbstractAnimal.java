package it.develhope.entities;

public abstract class AbstractAnimal implements IAnimal{

    public String name;
    public String type;
    public String typeOfFood;
    public boolean hasFur;

    public abstract void eat();
}
