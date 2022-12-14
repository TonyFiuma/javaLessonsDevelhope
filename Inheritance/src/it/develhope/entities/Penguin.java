package it.develhope.entities;

public class Penguin extends AbstractAnimal {

    public Penguin(){
        this.type = "Penguin";
    }

    @Override
    public void eat() {
        System.out.println("I'm eating fish");
    }

    @Override
    public void talk() {
        System.out.println("Talk Penguin");

    }

    @Override
    public void run() {

    }

    @Override
    public void drink() {
        System.out.println("Drink Penguin");

    }
}
