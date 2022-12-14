package it.develhope.ifConstructor;


import java.util.*;

public class Start {
    public static void main(String[] args) {
        String myArray[] = new String[]{"one","two","three","four"};

        for(int i = 0; i<myArray.length;i+=2){
            System.out.println(myArray[i]);
        }
        System.out.println("------------------");
        for(int i = myArray.length -1;i>=0;i--){
            System.out.println(myArray[i]);
        }
        System.out.println("-----------------------");

        Animal lion = new Animal("lion",10);
        Animal zebra = new Animal("zebra",15);
        Animal penguin = new Animal("penguin",5);

        boolean isThereLion = false;
        Animal animalArray[] = new Animal[]{lion,zebra,penguin};
        for (int i = 0; i < animalArray.length; i++) {
            Animal singleValue = animalArray[i];
            System.out.println("index is "+i);
            if(singleValue.type.equals("lion")){
                isThereLion = true;
                break;
            }
        }
        System.out.println("Is there a Lion? "+ isThereLion);
        System.out.println("------------------------");

        for (int i = 0; i < animalArray.length; i++) {
            Animal singleValue = animalArray[i];
            if(singleValue.type.equals("lion")){
                continue;
            }
            System.out.println("index is "+i);
            System.out.println("value is "+ singleValue);
        }
        System.out.println("-------------------for with Lists");
        List<Animal> animalList = new ArrayList<>();
        animalList.add(lion);
        animalList.add(zebra);
        animalList.add(penguin);

        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i));
        }
        System.out.println("--------------------------------");
        for (int i = animalList.size()-1; i >= 0 ; i--) {
            Animal singleValue = animalArray[i];
            if(singleValue.type.equals("lion")){
                animalList.remove(i);
            }
        }
animalList.stream().forEach(singleAnimal ->{
    System.out.println("Animal are "+singleAnimal);
});
        System.out.println("--------------------------");

        for (Animal animal:animalList
             ) {
            System.out.println(animal);
        }

        System.out.println("-------------------------------");

        Map<String, Animal> map = new HashMap<>();
        map.put("lion",lion);
        map.put("zebra",zebra);
        map.put("penguin",penguin);

        for (int i = 0; i < map.values().size(); i++) {
            System.out.println(map.values().stream().toArray()[i]);
        }
        System.out.println("------------------");
        for (Animal singleValue:map.values()
             ) {
            System.out.println("The single animal for map is "+singleValue);
        }
        System.out.println("---------------------------");
        Set<Animal> myAnimalSet = new HashSet<>();
        myAnimalSet.add(lion);
        myAnimalSet.add(zebra);
        myAnimalSet.add(penguin);

        for (Animal allAnimals:myAnimalSet
             ) {
            System.out.println(allAnimals);
        }
        System.out.println("---------------------------------");
        Object myAnimalArrayObject[] = myAnimalSet.toArray();
        for (int i = 0; i < myAnimalArrayObject.length; i++) {
            System.out.println(myAnimalArrayObject[i]);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("-------- List in Object----------");
        Animal superLion = new Animal("lion",10,Arrays.asList("meat","bigMac","chickenWrap"));
        Animal superZebra = new Animal("zebra",15,Arrays.asList("grass","leaf","vegetables"));
        Animal superPenguin = new Animal("penguin",5,Arrays.asList("fish","?","???","????"));

        List<Animal> superAnimals = Arrays.asList(superLion,superZebra,superPenguin);

        for (int i = 0; i < superAnimals.size(); i++) {
            Animal singleValue = superAnimals.get(i);
            if(singleValue.favoriteFood != null)
            for (int j = 0; j < singleValue.favoriteFood.size(); j++) {
                System.out.println("Printing favourite foods for"+ singleValue.type + " - "
                        + singleValue.favoriteFood.get(j));
            }
        }
        System.out.println("------------------------------");
        for (Animal animal:superAnimals) {
            if(animal.favoriteFood != null)
                for (String food:animal.favoriteFood) {
                System.out.println("Printing favourite foods for"+ animal.type + " - "
                        + food);
            }
        }
        System.out.println("--------------------------------------------------");
        superAnimals.stream().forEach(singleAnimal->{
            if(singleAnimal.favoriteFood != null)
                singleAnimal.favoriteFood.stream().forEach(singleFood->{
                System.out.println("Printing favourite foods for"+ singleAnimal.type + " - "
                        + singleFood);
            });
        });
}}
