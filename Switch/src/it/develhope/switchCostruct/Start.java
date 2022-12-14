package it.develhope.switchCostruct;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        int number =10;

        switch (number){
            case 1:
                System.out.println("The number is one");
                break;
            case 2:
                System.out.println("is 2");
                break;
            default:
                System.out.println("out of bounds(1-2)");
                break;
        }
        System.out.println("----------------------------");

        String name = "Axel";

        switch (name){
            case "Axel":
                System.out.println("The name is Axel");
                break;
            case "J":
                System.out.println("the name is J");
                break;
            case "Eric":
            case "Jane":
            case "Jonny":
                System.out.println("fools");
                break;
            default:
                System.out.println("We don't have this name in the database");
                break;
        }

        Set<String> names = new HashSet<>();
        names.add("Marco");
        names.add("Luca");
        names.add("Giovanni");

    }
}
