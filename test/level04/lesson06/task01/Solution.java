package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int nA = Integer.parseInt(sA);

        String sB = reader.readLine();
        int nB = Integer.parseInt(sB);

        if (nA<nB) System.out.println(nA);
        else System.out.println(nB);
        //напишите тут ваш код

    }
}