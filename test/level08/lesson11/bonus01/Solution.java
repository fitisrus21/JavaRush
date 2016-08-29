package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        list.add(0, "January");
        list.add(1, "February");
        list.add(2, "March");
        list.add(3, "April");
        list.add(4, "May");
        list.add(5, "June");
        list.add(6, "July");
        list.add(7, "August");
        list.add(8, "September");
        list.add(9, "October");
        list.add(10, "November");
        list.add(11, "December");

        String month = reader.readLine();
        int m = 13;
        for (int i = 0; i < list.size(); i++)
        {
            if (month.equals(list.get(i)))
            {
                m = i + 1;
            }
        }

        System.out.println(month + " is " + m + " month");
        //напишите тут ваш код
    }

}
