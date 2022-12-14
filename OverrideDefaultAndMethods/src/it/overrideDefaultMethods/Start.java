package it.overrideDefaultMethods;

public class Start {
    public static void main(String[] args) {
        System.out.println("--------------Start--------------");
    Animal giraffe = new Animal();
    giraffe.name = "Geraldina";
    giraffe.type = "Giraffe";

        Animal giraffe2 = new Animal();
        giraffe2.name = "Geraldina";
        giraffe2.type = "Giraffe";

        Animal zebra = new Animal();
        zebra.name = "Jonny";
        zebra.type = "Zebra";


        System.out.printf("Printing the giraffe %s %n",giraffe);
        System.out.printf("Printing the zebra %s %n",zebra);

        System.out.printf("Printing Animal %s %n %s %n",giraffe,zebra);

        System.out.println("-------- Equals method-----------");

        System.out.printf("Is Zebra equals to Giraffe? %s %n",giraffe == zebra);

        System.out.println(zebra.equals(giraffe));
        System.out.println(giraffe.equals(giraffe2));

        boolean out = giraffe.equals(giraffe2);
        System.out.println(out);

        System.out.println("------------Clone method-------------");
        try {
            Animal clonedGiraffe = giraffe.clone();
            clonedGiraffe.name = "Tania";
            System.out.println(giraffe);
            System.out.println("Cloned "+clonedGiraffe);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }





    }
}
