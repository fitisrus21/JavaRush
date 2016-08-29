package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.List;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {

        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {

        //напишите тут ваш код
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("sdfsdfsd");
        list1.add("skdjfsdkj");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("sdfsdfsd");
        list2.add("skdjfsdkj");

        ArrayList<String>[] list = new ArrayList[2];

        list[0] = list1;
        list[1] = list2;


        // s = new ArrayList<String>[5];

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}