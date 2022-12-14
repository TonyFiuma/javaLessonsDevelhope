package it.develhope.javaDoc;

/**
 * This Class rapresent an animal
 * @author Anto Fiuma
 * @version 1.2
 * @
 */
public class Animal {

    /**
     * The name of the animal
     */
    String name;
    /**
     * The race of the animal
     */
    String race;
    /**
     * Number of Teeth 1 to 36
     */
    int numberOfTeeth;
    /**
     *Set true if animal has fur
     */
    boolean hasFur;

    /**
     * This method makes the animal run
     */
    public void rub(){
        //Here will the run body
    }
    /*
    first line of comment
    second line of comment
     */

    /**
     * The animal eats
     */
    public void eat(){
        //Todo write the implementation
    }
    public void swim(){
        //Fixme this method is buggy
    }

    /**
     * This method does stuff
     * @param imput description of imput
     * @param imput2 description of imput2
     * @deprecated please use ....(maybe link or another stuff for replace the method
     * @return this is the return
     */
    public int doStuff(String imput, int imput2){
return 0;
    }
}
