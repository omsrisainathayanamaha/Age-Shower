
import java.util.Scanner;




import java.lang.System;

class calculator{
    /**
     *
     */
    

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("Enter your name.");
        name = scan.nextLine();
        System.out.println("Enter your birthday (an integer, for example in 3/26/1979, 26).");
        final int birthday = scan.nextInt();
        System.out.println("Enter your birth month (an integer, for example, in 3/26/1979, 3).");
        final int birthmonth = scan.nextInt();
        System.out.println("Enter your birth year (an integer, for example, in 3/26/1979, 1979).");
        final int birthyear = scan.nextInt();
        System.out.println("Enter today's day in the date (an integer, for example in 5/21/2020, 21).");
        final int day = scan.nextInt();
        System.out.println("Enter today's month in the date (an integer, for example, in 5/21/2020, 5).");
        final int month = scan.nextInt();
        System.out.println("Enter today's year in the date (an integer, for example, in 5/21/2020, 2020).");
        final int year = scan.nextInt();
       

        int yearAmount = year - birthyear;
        int monthAmount = month - birthmonth;
        if (monthAmount < 0) {
            yearAmount--;
            monthAmount = 12 + monthAmount;
        }
        int dayAmount = day - birthday;
        if (dayAmount < 0) {
            monthAmount--;
            dayAmount = 31 + dayAmount;
        }
        if (monthAmount < 0) {
            yearAmount--;
            monthAmount = 12 + monthAmount;
        }
        
        System.out.println(name + ", you are " + yearAmount + " years old, " + monthAmount + " months old, and "
                + dayAmount + " days old.");

    }
}