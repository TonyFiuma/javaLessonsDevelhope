package it.develhope.polimorfism.entities;

import it.develhope.polimorfism.interfaces.Food;

public class Lion extends AnimalAbstract{

    private double weight;

    @Override
    public double eat(Food food) {
        this.printFood(food);
        return food.getCalories() * 0.58 ;
    }

    @Override
    public double getStrength() {
        return 37;
    }

    @Override
    public void run() {
        System.out.println("The lion is running");
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}
