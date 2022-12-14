package it.develhope.genericsWildcards;

public class UserFromDatabase extends UserBase{
    public String name;
    public String surname;
    public int age;
    public boolean isMale;




    @Override
    public String getCompleteName() {
        return name + " " + surname;
    }

    public UserFromDatabase(){}
public UserFromDatabase(String name,String surname,int age,boolean isMale){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMale = isMale;
    }

    @Override
    public boolean isMale() {
        return isMale;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserFromDatabase{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
