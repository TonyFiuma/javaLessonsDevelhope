package it.develhope.mapsAndSet;

import java.util.Objects;

public class User {

    public String email;
    public String name;
    public String userName;

    public User(String email,String name,String userName){
        this.email= email;
        this.name = name;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) && Objects.equals(name, user.name) && Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name, userName);
    }
}
