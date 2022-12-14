package it.develhope.arrayAndList;

public class User {

    public String firstName;
    public String lastName;
    public String city;

    public User(String firstName,String lastName,String city){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;}

        public User(String[] fields){
        this.firstName = fields[0];
        this.lastName = fields[1];
        this.city = fields[2];
    }
}
