package it.develhope.ClassesAndObjects;

public class Car {

    public String model;
    public int wheelNumber;
    public String colour;
   public boolean isACabrio;

   public Door frontDoorLeft;
   public Door frontDoorRight;
    public Door rearDoorLeft;
    public Door rearDoorRight;
   public String print(){return isACabrio + " " + model + " " + wheelNumber + " " + colour;}
}
