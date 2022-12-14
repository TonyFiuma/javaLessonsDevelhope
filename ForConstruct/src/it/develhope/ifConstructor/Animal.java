package it.develhope.ifConstructor;

import java.util.List;

public class Animal {
    public String type;
    public int age;
public List<String> favoriteFood;
    public Animal(String type,int age){
        this.type = type;
        this.age = age;

    }
    public Animal(String type,int age,List<String> favoriteFood){
        this.type = type;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
