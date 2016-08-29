package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] N = s.toCharArray();
        if (N[0] != ' ')
        {
            String Up = Character.toString(N[0]);
            String Up1 = Up.toUpperCase();
            //  System.out.println(Up1);
            N[0] = Up1.charAt(0);
        }

        for (int i = 0; i <N.length-1 ; i++)
        {
            if (N[i] == ' ' && N[i+1] != ' ' && i+1 < N.length -1){
            String UP = Character.toString(N[i+1]);
            String UP1 = UP.toUpperCase();
              //  System.out.println(Up1);
                N[i+1] = UP1.charAt(0);

                // N[i+1] == 'W';
            }
        }

        System.out.println(N);



        //напишите тут ваш код
    }


}
