package it.overrideDefaultMethods;

import java.util.Objects;

public class Animal implements Cloneable{

    public String name;
    public String type;
    public AnimalLeg legLeft = new AnimalLeg();
    public AnimalLeg legRight = new AnimalLeg();


    @Override
    public String toString() {
        return "Animal: " + type + "-" + name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name) && type.equals(animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public Animal clone() throws CloneNotSupportedException{
     Animal clonedAnimal = (Animal)super.clone();
     clonedAnimal.legLeft = this.legLeft.clone();
     clonedAnimal.legRight = this.legRight.clone();
     return clonedAnimal;
        /*Animal clonedAnimal = new Animal();
     clonedAnimal.type = this.type;
     clonedAnimal.name = this.name;
     return clonedAnimal;
      */
    }
}
