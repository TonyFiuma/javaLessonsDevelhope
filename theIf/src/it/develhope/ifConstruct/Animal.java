package it.develhope.ifConstruct;

public class Animal {

   public int age;
   public String type;

   public Animal(int age,String type){
       this.age = age;
       this.type = type;
   }
    public void eat(){
      if(this.type.equals("zebra"))
          System.out.println("zebra eating");
      else if(this.type.equals("lion"))
          System.out.println("lion eating");
      else System.out.println("Nobody eats");

    }
}
