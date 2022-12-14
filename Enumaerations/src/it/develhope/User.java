package it.develhope;

public class User {

    public UserTypeEnum type;
    public String name;
    public String username;
    public String surname;

    public User(UserTypeEnum type,String name,String surname,String userName){
        this.type =type;
        this.name = name;
        this.surname = surname;
        this.username = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getCompleteName(){
        return this.name + " " + this.surname + "("+this.username+")";
    }
}
