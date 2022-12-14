package it.develhope.arrayAndList;

import it.develhope.arrayAndList.entities.*;

import java.util.*;
import java.util.stream.Stream;

public class StartArrayList {
    public static void main(String[] args) {
        List<IAnimal> animals = new ArrayList<>(5);
        animals.add(new Leo("AlexIV"));
        animals.add(new Zebra("MartinIII"));
        animals.add(new Dolphin("Dolphin JayII"));

        animals.remove(0);
        System.out.println("----------------");

        Animal penguin = new Animal("Soldato","5km/h",false,true);
        animals.add(penguin);

        animals.remove(penguin);
        System.out.println("-------");
        animals.add(penguin);

        System.out.println("Total size: " + animals.size());

        IAnimal animal = animals.get(1);
        //Dolphin animalDolphin = (Dolphin)animal;  Casting
        System.out.println("----------");

        /*animals.sort((o1, o2) -> {
            Animal a1 = ((Animal)o1);
            Animal a2 = ((Animal)o2);
            return  a2.name.compareTo(a1.name);
        });
        System.out.println(Arrays.toString(animals.toArray()));   */

animals.get(0).setAge(10);
animals.get(1).setAge(5);
animals.get(2).setAge(8);

        animals.sort((o1, o2) -> {
            return  o2.getAge() - o1.getAge();
        });
        /*animals.sort(new Comparator<IAnimal>() {
            @Override
            public int compare(IAnimal o1, IAnimal o2) {
                return 0;
            }
        });*/   //Versione Long
        System.out.println(Arrays.toString(animals.toArray()));
          animals.set(2,animal);

             animals.stream().forEach(iAnimal ->{
               iAnimal.setAge((int)(Math.random()*15));});

             List animalsMoreThanFive = animals.stream().filter(singleAnimal -> {
             return singleAnimal.getAge()>5;
             }).toList();

        animals.stream().filter(singleAnimal -> {
            return singleAnimal.getAge()>5;
        }).toList();

        List <Integer> animalsInteger = animals.stream().map(iAnimal -> iAnimal.getAge()).toList();

        boolean isOneAnimalMoreThan5 = animals.stream().anyMatch(singleAnimal -> {
            return singleAnimal.getAge() >5;
        });

        boolean isAllAnimalMoreThan5 = animals.stream().allMatch(singleAnimal -> {
            return singleAnimal.getAge() >5;
        });

        Optional<IAnimal> minAnimal = animals.stream().min((o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });
        Optional<IAnimal> maxAnimal = animals.stream().max((o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });
//Avoid null problem
if(minAnimal.isPresent()){
    System.out.println("The youngest animal is " + minAnimal.get().toString());}

    if(maxAnimal.isPresent()){
    System.out.println("The older animal is " + maxAnimal.get().toString());
}
    boolean isThereAnAnimal = animals.stream().filter(iAnimal -> {
        return ((Animal)iAnimal).canSwim;
    }).anyMatch(iAnimal -> {
        return iAnimal.getAge() > 5;
    });
    Stream<Object> ages = animals.stream().filter(iAnimal -> {
        return ((Animal)iAnimal).canSwim;
    }).map(iAnimal -> {
        return iAnimal.getAge() > 5;
    });

    List<Integer> d = new ArrayList<Integer>();//Integer classe di tipo intero che rappresenta Number
    List<Long> c = new ArrayList<Long>();
    List<Double> e = new ArrayList<Double>();
    System.out.println();
    }
}
