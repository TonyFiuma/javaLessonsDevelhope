package it.develhope.arrayAndList.entities;

public class Animal implements IAnimal{

    public String name;
    public String speed;
    public boolean canFly;
    public boolean canSwim;
    public int age;

    public Animal(String name, String speed,boolean canFly,boolean canSwim){
         this.name = name;
         this.speed = speed;
         this.canFly =  canFly;
         this.canSwim =  canSwim;


    }

    @Override
    public void eat() {
        System.out.println("The animal is eating");

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void setAge(int age) {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed='" + speed + '\'' +
                ", canFly=" + canFly +
                ", canSwim=" + canSwim +
                ", age=" + age +
                '}';
    }
}
