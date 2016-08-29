package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int nA = Integer.parseInt(sA);
        String sB = reader.readLine();
        int nB = Integer.parseInt(sB);
        String sC = reader.readLine();
        int nC = Integer.parseInt(sC);

        if ((nA>nB&&nB>nC)||(nA<nB&&nB<nC)) System.out.println(nB);
        if ((nA<nB&&nA>nC)||(nA>nB&&nA<nC)) System.out.println(nA);
        if ((nA>nC&&nB<nC)||(nA<nC&&nB>nC)) System.out.println(nC);

        //напишите тут ваш код
    }
}
