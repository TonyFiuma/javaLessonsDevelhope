package it.develhope.arrayAndList;

import it.develhope.arrayAndList.entities.*;

import java.util.Arrays;

public class StartAnimals {
    public static void main(String[] args) {
        Animal leo = new Animal("Leo","30 km/h",false,true );
        Animal zebra = new Animal("Zeb","35 km/h ",false,true );
        Animal dolphin = new Animal("Dol","40 knots",false,true );
        Animal eagle = new Animal("Eag","50 km/h",true,false );
        System.out.println("Name of the eagle is "+eagle.name);

        Animal theAnimals []= new Animal[]{leo,zebra,dolphin,eagle};


        Animal theAnimals2 []= new Animal[2];
        theAnimals2[0] = leo;
        theAnimals2[1] = eagle;

        Animal theAnimals3 []= new Animal[]{new Animal("Mouse","15 km/h",false,false),zebra
        ,eagle};
        System.out.println("List result:");
        System.out.println("The Animal I: " +Arrays.toString(theAnimals));
        System.out.println("The Animal II: " +Arrays.toString(theAnimals2));
        System.out.println("The Animal III: " +Arrays.toString(theAnimals3));
        System.out.println("List result");

        theAnimals3[2].name="Aquilotto";
        System.out.println("Name of the eagle is "+eagle.name);

        Animal[] arrayOfPolyAnimals =new Animal[2];
        arrayOfPolyAnimals[0] = new Leo("Alex");
        arrayOfPolyAnimals[1] = new Zebra("Martin");

        Leo arrayOfLions[]=new Leo[2];
        arrayOfLions[0] = new Leo("AlexII");
        //arrayOfLions[1] = new Zebra("MartinII"); Not permitted

        IAnimal animalsInterface[] = new IAnimal[2];
        animalsInterface[0] = new Leo("AlexIII");
        animalsInterface[1] = new Dolphin("Dolphin Jay");

animalsInterface[0].eat();

    }
}
