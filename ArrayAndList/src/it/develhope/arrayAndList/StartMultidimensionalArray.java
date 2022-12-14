package it.develhope.arrayAndList;

import java.util.Arrays;

public class StartMultidimensionalArray {



    public static void main(String[] args) {

        String arrayMultidimensional[][] = new String[][]{
                {"Axel","Foley","Detroit"},
                {"Angela","Merkel","Berlin"},
                {"Paolo","Rossi","Rome"},
        };

        for(int i = 0;i< arrayMultidimensional.length;i++){
           System.out.println(Arrays.toString(arrayMultidimensional[i]));}

        String cityOfGloria = arrayMultidimensional[1][2];


        User[] user = new User[]{
                new User("Axel","Foley","Detroit"),
                new User(arrayMultidimensional[1]),
                new User("Paolo","Rossi","Rome"),
                new User(new String[]{"Jonny","Stecchino","Palermo"})
        };

        String cityOfGloriaObject = user[1].city;

        String arrayMultidimensionalII[][] = new String[2][5];
        arrayMultidimensionalII[0][0] = "a";
        arrayMultidimensionalII[0][1] ="abcd";
        arrayMultidimensionalII[0][2] ="abcd";
        arrayMultidimensionalII[0][3] ="abcd";
        arrayMultidimensionalII[0][4] ="abcd";

        arrayMultidimensionalII[1][0] ="abcd";
        arrayMultidimensionalII[1][1] ="abcd";
        arrayMultidimensionalII[1][2] ="abcd";
        arrayMultidimensionalII[1][3] ="abcd";
        arrayMultidimensionalII[1][4] ="abcd";

        System.out.println();
}}
