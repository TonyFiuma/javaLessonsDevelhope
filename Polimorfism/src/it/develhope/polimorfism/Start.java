package it.develhope.polimorfism;

import it.develhope.polimorfism.entities.AnimalAbstract;
import it.develhope.polimorfism.entities.Dolphin;
import it.develhope.polimorfism.entities.Lion;
import it.develhope.polimorfism.entities.Zebra;
import it.develhope.polimorfism.interfaces.Animal;
import it.develhope.polimorfism.interfaces.Food;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Start {

   static Food genericFood = new Food() {
        @Override
        public double getCalories() {
            return 500;
        }

        @Override
        public double getFatGrams() {
            return 15;
        }

        @Override
        public double getCarboGrams() {
            return 20;
        }

        @Override
        public double getProteinGrams() {
            return 70;
        }

        @Override
        public double getVitaminsGrams() {
            return 4;
        }

        @Override
        public String getName() {
            return "Generic food";
        }
    };
    public static void main(String[] args) {

        Animal lion = new Lion();
        AnimalAbstract lion2 = new Lion();
        Lion lion3 = new Lion();

        Animal zebra= new Zebra();
        Animal dolphin = new Dolphin();

        List<Animal> zoo = new ArrayList<>();
        Collections.addAll(zoo,lion,zebra,dolphin);

        System.out.println("Lion versus zebra, does the lion win? " +lion.fightAgainst(zebra));
        System.out.println("Dolphin Vs zebra does dolphin win? " + dolphin.fightAgainst(zebra));

        System.out.println("The animals are running ");



        zoo.stream().forEach(animal->{animal.run();
        });
        System.out.println("--------------------------------");
        double totalCalories =0;
        for (int i =0;i<zoo.size();i++){
            Animal single = zoo.get(i);
            double totalCaloriesAnimal = single.eat(genericFood);
            totalCalories+=totalCaloriesAnimal;
        }

        Lion lionCast = (Lion) lion;//castare per avere i metodi di quella classe

        System.out.println("All animals have eaten "+ totalCalories + " calories");


    }
}
