package com.javarush.myData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by MErmolaev on 28.06.2016.
 */
public class TestMain
{
    public static void main(String[] args)
    {


        //String date = "20150625";

     //   System.out.println(new Date());

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String dateInString = "20150625";

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
        //    System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
