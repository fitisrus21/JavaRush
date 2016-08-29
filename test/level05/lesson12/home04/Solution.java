package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/


import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
      Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd MM yyyy");
        System.out.println(format1.format(d));
        //  System.out.println (new java.util.Date ().toString ());
       // System.out.println(new Date().toString(dd:mm:yy));

       // String strFormat = "dd/MM/yyyy";
       // DateFormat myDateFormat = new SimpleDateFormat(strFormat);
//напишите тут ваш код
    }
}
