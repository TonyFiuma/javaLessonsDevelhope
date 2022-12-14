package it.develhope.genericsWildcards;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        System.out.println("---------------Start--------------");

        List<Car> myList =new ArrayList();
        myList.add(new Car());
        Car car = myList.get(0);

        List myListGeneric = new ArrayList();
        myListGeneric.add(new Car());
        myListGeneric.add(new UserFromDatabase());
        myListGeneric.add(new String("This is a string"));

        List<? super IUser> listUser = new ArrayList<>();
        listUser.add(new UserBase());
        listUser.add(new UserBase());
        IUser singleIUser =(IUser) listUser.get(0);

        List<? super UserBase> listUserBase = new ArrayList<>();
        listUserBase.add(new UserFromDatabase());
        UserBase singleUserBase =(UserBase) listUser.get(0);

        List<? extends UserFromDatabase> asdad = new ArrayList<>();
        System.out.println("----------------------------------------");
        Factory myFactory = new Factory();
        myFactory.employee = new UserFromDatabase("Axel","Foley",51,true);
        myFactory.printEmployee();







UserFromDatabase axel = new UserFromDatabase("Axel","Foley",51,true);{
            System.out.println(axel.name);
    axel = setNameToUser(axel,"nuovo nome bellisiimo");
            System.out.println(axel.name);
        }



    }
    public static <T extends IUser> T setNameToUser(T user,String name){
        user.setName(name);
        return user;
    }

    public static void doStuffWithFactory(Factory<?> factory){
        factory.employee.getCompleteName();
    }
}
