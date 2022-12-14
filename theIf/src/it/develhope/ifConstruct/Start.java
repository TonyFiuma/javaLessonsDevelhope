package it.develhope.ifConstruct;

public class Start {
    public static void main(String[] args) {

        int numb = 56;
        String sky ="blue";

        if(numb<30) {
            System.out.println("The number is less than 30");
        } else if (sky.equals("blue")) {
            System.out.println("The sky is blue");
    }else{
            System.out.println("No condition met");}


        if(numb>30)
            System.out.println("ciao");
        else
            System.out.println("bao");


        Animal lion = new Animal(40,"lion");
        Animal zebra = new Animal(40,"zebra");
        Animal penguin = new Animal(23,"penguin");

        /*if(animal.age<40)
            animal.eat();
        else System.out.println("Animal is young");*/

        lion.eat();
        zebra.eat();
        penguin.eat();
    }
}
