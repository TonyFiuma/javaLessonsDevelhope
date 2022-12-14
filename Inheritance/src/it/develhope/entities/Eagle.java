package it.develhope.entities;

public class Eagle extends AnimalEatingMeatAndFlying implements IFlyingAnimal,IAnimalEating{
    @Override
    public void eat() {

    }

    @Override
    public void talk() {

    }

    @Override
    public void run() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void Fly() {
        System.out.println("Eagle - I'm flying");

    }
}
