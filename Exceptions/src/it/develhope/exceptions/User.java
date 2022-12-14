package it.develhope.exceptions;

public class User {
    private String name;
    private String surname;
    private String userName;
    private int age = 0;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception { //devo mettere throws E.. per poter lanciare un ' eccezzione nel metodo e richiamarla nell'if
        if(age<=0){
            throw new AgeException(age);
        }
        if(age==0){
            throw new ZeroAgeException();
        }
        this.age = age;
    }

    public void validateData() throws Exception,AgeException {
        if(name == null)throw new NullPointerException("Name is null");
        if(surname == null)throw new NullPointerException("Surname is null");
        if(userName == null)throw new NullPointerException("Username is null");
        if(age < 0)throw new AgeException(this.age);
    }
}
