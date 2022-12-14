package it.develhope.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Start {

    public static void main(String ...args){

        LocalDate today = LocalDate.now();
        LocalDate tomorrow = LocalDate.now();
        tomorrow = tomorrow.plus(1, ChronoUnit.DAYS).plus(1,ChronoUnit.MONTHS);
        System.out.println("Day " + today.getDayOfWeek().ordinal());
        System.out.println("Month " + today.getMonth());
        System.out.println("Year " + today.getYear());

        System.out.println("---------------------------");

        System.out.println("Day " + tomorrow.getDayOfWeek());
        System.out.println("Month " + tomorrow.getMonth());
        System.out.println("Year " + tomorrow.getYear());

        System.out.println("--------------------------------------");

        System.out.println("Is after " + today.isAfter(tomorrow));//boolean
        System.out.println("Is after " + today.isBefore(tomorrow));//boolean
        System.out.println("Is leap year " + today.isLeapYear());//boolean
        System.out.println("To String " + today.toString());//boolean

        System.out.println("--------------------------------------");

        tomorrow =today.plusDays(1).plusYears(2).plusMonths(3);

        System.out.println("-----------------------------Time--------------------------");

        LocalTime now = LocalTime.now();
        System.out.println("Hour " + now.getHour());
        System.out.println("Second " + now.getMinute());
        System.out.println("Minute " + now.getSecond());

        System.out.println("-------------------------------");

        LocalTime now2 = LocalTime.now().plusHours(1).plusSeconds(12).plusMinutes(5);
        System.out.println(now2);

        System.out.println("---------------Date--------------------");

        Date myDate = new Date();
        Date myDate2 = new Date(2022,10,12,00,00,00);
        long myDateTime = myDate.getTime();
        long date2time = myDate2.getTime();
        long diff = myDateTime - date2time;

        System.out.println(myDateTime);
        System.out.println(date2time);
        System.out.println(diff);

        System.out.println("-------------Between-----------------");

        LocalDate date1 = LocalDate.of(2022,04,10);
        LocalDate date2 = LocalDate.of(2022,11,10);
        LocalDate dateBetween = LocalDate.now();

        if(date1.isBefore(dateBetween) && date2.isAfter(dateBetween)){
            System.out.println("The date is between " + date1 + " " + date2);
        }else{
            System.out.println("The date is outside");}

        System.out.println("----------------------Date Formatter--------------------");

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("YYYY-MMM-dd");
        System.out.println(date1.format(formatter));
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));



    }
}
