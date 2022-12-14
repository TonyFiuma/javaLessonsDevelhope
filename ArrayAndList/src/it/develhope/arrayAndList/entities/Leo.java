package it.develhope.arrayAndList.entities;

public class Leo extends Animal{
    public Leo(String name) {
        super(name, "30 km/h", false,true );
    }

    @Override
    public void eat() {
        System.out.println("Leo is eating");}

        public void run(){
            System.out.println("The Lion is running");}


}
