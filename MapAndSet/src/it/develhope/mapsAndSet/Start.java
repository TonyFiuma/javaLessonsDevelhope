package it.develhope.mapsAndSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        String[] myStringArray = new String[]{"one" ,"two" ,"three"};
        Arrays.stream(myStringArray).forEach(single->{
            System.out.println(single);
        });
        System.out.println("--------------------------------------------");
        /*for(String i:myStringArray){
            System.out.println(i);
        }
           Arrays.stream(myStringArray).forEach((String s)->{          Another two ways to write forEach
                                                                       first is classic the second is lamda
         Arrays.stream(myStringArray).forEach(System.out::println);    the third is the shorter way.
         */

        //Set concept

        Set<String> mySet = new HashSet<>();
        mySet.add("pippo");
        mySet.add("pluto");
        mySet.add("paperino");

        mySet.addAll(Arrays.asList("pippo2","pluto2","paperino2"));

        Object[] myArray = mySet.toArray();
        mySet.stream().forEach(singleElement ->{
            System.out.println(singleElement);
        });
        System.out.println("-----------------------------------");

        mySet.stream().forEach(singleElement->{
            System.out.println("Single element in array - " +singleElement);
        });
        System.out.println("----------------------------------------");
        mySet.stream().filter(singleElement->{return singleElement.contains("2");
        }).forEach(singleElement->{
            System.out.println("Single element in array - " +singleElement);});
        System.out.println("----------------------------------------");

             /*User axel = new User("axelfiumano@gmail.com","Antonio","Axel");
             User axel2 = new User("axelfiumano@gmail.com","Antonio","Axel");
             User axel3 = new User("axelfiumano@gmail.com","Antonio","Axel");
             //In this case the hash code is the same then java will print only one object because for him is the same
              because I used override in class User of method   public int hashCode() {
        return Objects.hash(email, name, userName); and if the object has the sames attributes then has the same hashcode
        AND SO HE DELETES THE DUPLICATES WITH ---SET---
    }
              */

             User axel = new User("axelfiumano@gmail.com","Antonio2","Axel");
             User axel2 = new User("axelfiumano@gmail.com","Antonio3","Axel");
             User axel3 = new User("axelfiumano@gmail.com","Antonio4","Axel");


        //System.out.println(axel.hashCode()); the same result of the sout below
             int axelHashCode = axel.hashCode();
             int axel2HashCode = axel2.hashCode();
             int axel3HashCode = axel3.hashCode();

        System.out.println("Hash codes " + axelHashCode + "--" + axel2HashCode);

        System.out.println("------------------------------------");

        Set<User> mySetUser = new HashSet<>();
        mySetUser.add(axel);
        mySetUser.add(axel2);
        mySetUser.add(axel3);

//mySetUser.stream().forEach(System.out::println); come si potrebbe fare
        mySetUser.stream().forEach(singleUser->{
            System.out.println("User - " + singleUser + " hash code " + singleUser.hashCode());
        });


    }
}
