
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.time.Clock;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
import java.sql.Array;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import java.lang.System;

class calculator {
    /**
     * @throws ParseException
     *
     */

    public static void main(final String[] args) throws ParseException {
        final Scanner scan = new Scanner(System.in);
       
        String name;
        System.out.println("Enter your name.");
        name = scan.nextLine();
        System.out.println("Enter your birthday (an integer, for example in 3/26/1979, 26).");
        final int birthday = scan.nextInt();
        System.out.println("Enter your birth month (an integer, for example, in 3/26/1979, 3).");
        int birthmonth = scan.nextInt();
        birthmonth--;
        System.out.println("Enter your birth year (an integer, for example, in 3/26/1979, 1979).");
        final int birthyear = scan.nextInt();
        System.out.println("Enter today's day in the date (an integer, for example in 5/21/2020, 21).");
        final int day = scan.nextInt();
        System.out.println("Enter today's month in the date (an integer, for example, in 5/21/2020, 5).");
        final int month = scan.nextInt();
        System.out.println("Enter today's year in the date (an integer, for example, in 5/21/2020, 2020).");
        final int year = scan.nextInt();
        final SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        final Date today = new Date();
        
        // System.out.println(dateFormatter.format(today));
        /*
         * SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
         * Date firstDate = sdf.parse("06/24/2017"); Date secondDate =
         * sdf.parse("06/30/2017");
         
        final LocalDate birthDate = LocalDate.of(birthyear, birthmonth, birthday);
        

        final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        final Date firstDate = sdf.parse(birthDate);
        final Date secondDate = sdf.parse("06/30/2017");

        final long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        final long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
 
    
        
          */
        
        
        
       
        
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
