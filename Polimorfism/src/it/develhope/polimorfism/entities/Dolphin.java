package it.develhope.polimorfism.entities;

import it.develhope.polimorfism.interfaces.Drinkable;
import it.develhope.polimorfism.interfaces.Food;

public class Dolphin extends FishAbstract{

    private double speed;


    @Override
    public double eat(Food food) {
        System.out.println("The dolphin is eating " + food.getName());
        return food.getCalories()* 0.87;
    }

    @Override
    public void drink(Drinkable drinkable) {

    }

    @Override
    public void run() {
        System.out.println("The dolphin doesn't run");
    }

    @Override
    public double getStrength() {
        return 0;
    }

    public double getSpeed(){
        return this.speed;
   }
   public void setSpeed(double speed){
        this.speed = speed;
   }
}
