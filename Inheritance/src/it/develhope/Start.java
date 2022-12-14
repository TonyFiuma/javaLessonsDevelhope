package it.develhope;

import it.develhope.entities.*;

public class Start {
    public static void main(String[] args) {
        System.out.println("-------Start the Zoo--------");
        AbstractAnimal animal = new AbstractAnimal() {
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
            public void eat() {
                System.out.println("The animal eat all the stuffs ");
            }
        };

        animal.name = "Zebra";


        Giraffe giraffe = new Giraffe();
        Penguin penguin = new Penguin();
        Lion lion = new Lion();
        Eagle eagle = new Eagle();

        System.out.printf("Animal %s %n ",giraffe.type);

        Zookeeper zookeeper = new Zookeeper();

        zookeeper.feedAnimal(giraffe);
        zookeeper.feedAnimal(penguin);
        zookeeper.feedAnimal(lion);
        zookeeper.feedAnimal(eagle);


        zookeeper.talkWithAnimal(giraffe);
        zookeeper.talkWithAnimal(eagle);
        zookeeper.talkWithAnimal(lion);
        zookeeper.talkWithAnimal(penguin);

        zookeeper.makeAnimalFly(eagle);




    }
}
