package it.develhope.ClassesAndObjects;

public class Start {
    public static void main(String[] args) {

        Preferences preferences = Preferences.getInstance();
        System.out.println(preferences.maxPlacesInGarage);
        System.out.println(preferences.garageName);

        /*Car mini = new Car();
        mini.isACabrio = false;
        mini.model = "Mini D";
        mini.wheelNumber = 4;
        mini.colour = "Grey";



        Door door = new Door();
        door.isElectricDoor = true;
        door.color = "yellow";
        door.hasKeyAcces = true;
        door.isElectricWindow = true;

        Door door2 = new Door();
        door2.isElectricDoor = true;
        door2.color = "blue";
        door2.hasKeyAcces = true;
        door2.isElectricWindow = true;

        Door door3 = new Door();
        door3.isElectricDoor = true;
        door3.color = "red";
        door3.hasKeyAcces = true;
        door3.isElectricWindow = true;

        Door door4 = new Door();
        door4.isElectricDoor = true;
        door4.color = "red";
        door4.hasKeyAcces = true;
        door4.isElectricWindow = true;




        //door3.color = "blue";
        //mini.rearDoorRight.color = "blue";

        System.out.println("-----------------------------------------");
        System.out.println("Mini ------- " + mini.print());
        mini.frontDoorLeft.print();
        mini.frontDoorRight.print();
        mini.rearDoorLeft.print();
        mini.rearDoorRight.print();
        System.out.println("-----------------------------------------");

        /*Car audi = new Car();
        audi.isACabrio = true;
        audi.model = "A3";
        audi.wheelNumber = 4;
        audi.colour = "red";*/

        //System.out.println("Mini " + mini.print());
        //System.out.println("Audi " + audi.print());

        //System.out.println("Mini " + mini.isACabrio + " " + mini.model + " " + mini.wheelNumber + " " + mini.colour);
       // System.out.println("Audi " + audi.isACabrio + " " + audi.model + " " + audi.wheelNumber + " " + audi.colour);
        //System.out.println("--------------------------------------------------------------------");
        //audi.model = "A6";

        //System.out.println("Mini " + mini.isACabrio + " " + mini.model + " " + mini.wheelNumber + " " + mini.colour);
        //System.out.println("Audi " + audi.isACabrio + " " + audi.model + " " + audi.wheelNumber + " " + audi.colour);

        //CarStatic fiat = new CarStatic();
        //CarStatic.power = 5;*/
    }
}
