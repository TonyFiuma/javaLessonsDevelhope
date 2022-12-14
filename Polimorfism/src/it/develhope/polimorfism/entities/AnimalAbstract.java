package it.develhope.polimorfism.entities;

import it.develhope.polimorfism.interfaces.Animal;
import it.develhope.polimorfism.interfaces.Drinkable;
import it.develhope.polimorfism.interfaces.Food;

public abstract class AnimalAbstract implements Animal {

    private double strength;

    @Override
    public void drink(Drinkable drinkable) {
        System.out.println("The animal is drinking "+ drinkable.getName());
    }

    protected void printFood(Food food){
        System.out.println("The " + this.getClass().getName()+ " is eating " + food.getName());
        System.out.println("Nutrition - C:" + food.getCarboGrams() + " F: "
                + food.getFatGrams() + " P: " + food.getProteinGrams());
    }

    @Override
    public boolean fightAgainst(Animal animal) {
       return this.getStrength() - animal.getStrength() > 0;
    }

    @Override
    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
}
