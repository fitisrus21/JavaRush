package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.Arrays;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
     /*  int[] temp1 = {1, 3, 5, 7, 8};
        int[] temp2 = {2, 3};
        int[] temp3 = {3, 5, 7, 9};
        int[] temp4 = {1, 3, 5, 7, 8, 5, 7};
        int[] temp5 = {};
        ArrayList<int[]> list = new ArrayList<>();
        list.add(temp1);
        list.add(temp2);
        list.add(temp3);
        list.add(temp4);
        list.add(temp5);
        return list;
        */   // ТАК РАБОТАЕТ И ПРОШЛА ПРОВЕРКУ

        int[][] list1 = {{1, 3, 5, 7, 8},
                         {2, 3},
                         {3, 5, 7, 9},{1, 3, 5, 7, 8, 5, 7},
                         {},};

        ArrayList<int[]> ll = new ArrayList<>(Arrays.asList(list1));

        return ll;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
