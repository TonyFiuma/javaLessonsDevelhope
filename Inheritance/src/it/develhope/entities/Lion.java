package it.develhope.entities;

public class Lion extends AbstractAnimal {

    public Lion(){
        this.type = "Lion";
    }

    @Override
    public void eat() {
        System.out.println("I'm eating meat");
    }

    @Override
    public void talk() {
        System.out.println("roar");

    }

    @Override
    public void run() {

    }

    @Override
    public void drink() {
        System.out.println("I'm drinking blood");

    }
}
