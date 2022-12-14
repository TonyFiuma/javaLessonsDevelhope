package it.develhope.encapsulation;

public class Start {

    public static void main(String[] args) {
        User u = new User();
        u.setId("123456");
        u.setEmail("123@gmail.com");
        u.setPassword("sososos-sosososo-spspsps");
        u.setAddress("Via delle Palme 15");
        u.setName("Antonio");
        u.setSurname("Fiuma");

        Car car = new Car(12.0,12,12.0,12.0);
        System.out.println(car.toString());
    }
}
