package it.develhope.arrayAndList;

import java.util.Arrays;

public class Start {


    public static void main(String[] args) {
        int myList[] = new int[2];
            myList[0] = 2;
            myList[1] = 1;
        System.out.println("The list is " + Arrays.toString(myList));
        System.out.println("The list length is " + myList.length);

        String myListString []= new String[3];
        double myListDouble []= new double[3];
        long myListLong []= new long[3];
        boolean myListBoolean []= new boolean[3];

        double initDouble[] = new double[]{10.2,9.3,7.4};
        System.out.println("Double list initialized "+ initDouble.length + " elements " + Arrays.toString(initDouble));


    }
}
