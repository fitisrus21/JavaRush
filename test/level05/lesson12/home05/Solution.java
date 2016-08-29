package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      //  String s = reader.readLine();
        int sum = 0;




        while (1==1)
        {
             String s = reader.readLine(); //почему объявить можно только тут, иначе не выходит из цикла.
            if (s.equals("сумма"))
            {
                System.out.println(sum);
                break;
            } else
            {
                int n = Integer.parseInt(s);
                sum = sum + n; //работает только так, но не напрямую через
            }



        }

    }
}



        //напишите тут ваш код


