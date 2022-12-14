package it.develhope.entities;

public class Surikata extends AbstractAnimal {
    @Override
    public void eat() {
        System.out.println("Don't know what to eat");
    }

    @Override
    public void talk() {
        System.out.println("Talk Surikata");

    }

    @Override
    public void run() {

    }

    @Override
    public void drink() {
        System.out.println("I'm Surikata and I'm drinking");

    }
}
