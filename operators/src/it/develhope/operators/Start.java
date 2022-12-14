package it.develhope.operators;

public class Start {
    public static void main(String[] args) {
        int varA = 10;
        System.out.println(varA);
        System.out.println(varA++);
        System.out.println(++varA);

        int varB = 10;
        System.out.println(varB);
        System.out.println(varB--);
        System.out.println(--varB);

        int a =2;
        int b =5;
        System.out.println(b/a);//division between integers then I need to cast one of two in float to have a right result
        System.out.println(b%a);

        System.out.println(b*=3);
        System.out.println(b/=3);
        System.out.println(b%=3);

        String s1 ="How are you today?";
       String[] newArray = s1.split("are");
        for(int i =0;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }
}
