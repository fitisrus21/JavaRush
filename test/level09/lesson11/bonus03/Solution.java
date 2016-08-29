package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
       int numCount = 0;
       int worCount = 0;

        for (int i = 0; i <array.length ; i++)
        {
            if (isNumber(array[i]))
            {
                numCount++;
            }
            else
            {
                worCount++;
            }
        }

      String[] numArray = new String[numCount];
      String[] worArray = new String[worCount];

        int n = 0;
        int w = 0;

        for (int i = 0; i <array.length ; i++)
        {
            if (isNumber(array[i]))
            {
                numArray[n] = array[i];
                n++;
            }
            else
            {
                worArray[w] = array[i];
                w++;
            }
        }

        for (int j = 0; j < numArray.length; j++) // сортируем массив чисел по убыванию, при этом string преобразуем в int
        {
            for (int i = j + 1; i < numArray.length; i++)
            {
                if (Integer.parseInt(numArray[i]) > Integer.parseInt(numArray[j]))
                {
                    String temp = numArray[j];
                    numArray[j] = numArray[i];
                    numArray[i] = temp;
                }
            }
        }

        for (int j = 0; j < worArray.length; j++) // сортируем массив слов, анализируя регистр
        {
            for (int i = j + 1; i < worArray.length; i++)
            {
                if (isGreaterThan(worArray[j].toLowerCase(),worArray[i].toLowerCase()))
                {
                    String temp = worArray[j];
                    worArray[j] = worArray[i];
                    worArray[i] = temp;
                }
            }
        }

/*
        for (int i = 0; i <numArray.length ; i++)
        {
            System.out.println(numArray[i]);
        }
*/
            int nn = 0;
            int ww = 0;

            for (int i = 0; i < array.length; i++)
            {
                if (isNumber(array[i]))
                {
                    array[i] = numArray[nn];
                    nn++;
                } else
                {
                    array[i] = worArray[ww];
                    ww++;
                }
            }


            //  System.out.println(numCount + "!!!!!");
            //  System.out.println(worCount);

        //напишите тут ваш код
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}