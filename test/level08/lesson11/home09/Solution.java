package com.javarush.test.level08.lesson11.home09;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException
    {

        System.out.println("JANUARY 1 2015 = " + isDateOdd("JANUARY 1 2015"));
            }

    public static boolean isDateOdd(String date) throws ParseException
    {
        SimpleDateFormat ft = new SimpleDateFormat("MMMM dd yyyy",  Locale.ENGLISH);
        Date newDate = ft.parse(date);
       // newDate.getYear()
        Date yearStart = new Date();
        yearStart.setDate(1);
        yearStart.setMonth(0);

        long diffMs = newDate.getTime() - yearStart.getTime();
        long ms = 1000 * 60 * 60 *24;

        int day = (int)(diffMs/ms);
        System.out.println(day);

        if ( day%2 == 1 )
        { return true;}
            else if (day%2 == 0)
        { return false;}
        return true;

    }
}
