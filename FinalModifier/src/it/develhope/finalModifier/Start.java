package it.develhope.finalModifier;

public class Start {
    public static void main(String[] args) {
final User antonio = new User("123-456-789");
antonio.setName("Antonio");
antonio.setSurname("Fiumano");
antonio.setAge(37);

Factory factory = new Factory(antonio,antonio,antonio);
        System.out.println(factory);
    }
}
