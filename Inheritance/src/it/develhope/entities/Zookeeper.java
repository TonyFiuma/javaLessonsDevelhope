package it.develhope.entities;

public class Zookeeper {

    String name;

    public void feedAnimal(AbstractAnimal animal){
        System.out.printf("I am feeding the animal %s%n",animal.type);
        animal.eat();
    }
    public void talkWithAnimal(IAnimal animal){
        animal.talk();
    }

    public void giveWaterToAnimal(IAnimal animal){
        animal.drink();
    }

    public void makeAnimalFly(IFlyingAnimal animal){
        animal.Fly();
    }
}
