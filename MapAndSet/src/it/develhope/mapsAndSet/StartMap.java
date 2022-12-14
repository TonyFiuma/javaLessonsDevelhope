package it.develhope.mapsAndSet;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StartMap {
    public static void main(String[] args) {
        Map<String,User> myMap = new HashMap<>();
        myMap.put("axelfiumano@gmail.com",new User("axelfiumano@gmail.com","Antonio","Axel"));
        myMap.put("gloria@gmail.com",new User("gloria@gmail.com","Gloria","Glox"));
        myMap.put("marco@gmail.com",new User("marco@gmail.com","Marco","Marx"));
        //myMap.put("marco@gmail.com",new User("marco2@gmail.com","Marco2","Marx2")); with the same key you replace th attributes
        myMap.put("marco2@gmail.com",new User("marco@gmail.com","Marco","Marx"));
        myMap.put("marco3@gmail.com",new User("marco@gmail.com","Marco","Marx"));
        myMap.put("marco4@gmail.com",new User("marco@gmail.com","Marco","Marx"));
        //I can duplicate the values if I change the key as opposed to set
        System.out.println(myMap.get("gloria@gmail.com"));

        myMap.forEach((key,value)->{
            System.out.println("The single value is " + key + " the value " + value);
        });

        System.out.println("-----------------------------------------");

        myMap.remove("marco2@gmail.com");
        myMap.replace("marco3@gmail.com",new User("marcoxx@gmail.com","Marcoxx","Marxxx"));
        myMap.forEach((key,value)->{
            System.out.println("The single value is " + key + " the value " + value);
        });
        System.out.println(myMap.isEmpty());
        System.out.println(myMap.keySet());
        System.out.println("---------------------------------------------");

       /* Set<String> keys = myMap.keySet();
        keys.forEach(key->{
            User value = myMap.get(key);
            System.out.println("The single value is " + key + " the value " + value);
        });
        System.out.println("------------------------------------");

        myMap.keySet().forEach(key->{
            User value = myMap.get(key);
            System.out.println("The single value is " + key + " the value " + value);
        });
        // non performante
        */
    }
}
