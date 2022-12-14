package it.develhope.whileConstruct;

public class Start {
    public static void main(String[] args) {
int a =2;
        while (a<100){
            a = a*2;
            System.out.println(a);
    }
        System.out.println("----------------------");
        a = 2;
        while (true){
            a = a*2;
            System.out.println(a);//bad practice
            if(a>100) break;
        }

        System.out.println("----------------------");
 int index = 0;
 do{
     System.out.println("index is "+index);
     index++;
 }while (index<5);



}}
