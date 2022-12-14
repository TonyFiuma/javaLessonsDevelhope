package it.develhope.ClassesAndObjects;

public class Preferences {

    private static Preferences preferences = new Preferences();

public int maxPlacesInGarage = 100;
    public String garageName = "my garage";
    private Preferences(){};

    public static Preferences getInstance(){return preferences;}
}
