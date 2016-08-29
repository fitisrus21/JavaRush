package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        String sC = reader.readLine();
        int nC = Integer.parseInt(sC);

        if ((nA>nB)&&(nB>nC)) System.out.println(nA + " " + nB + " " + nC);
        if ((nB>nA)&&(nA>nC)) System.out.println(nB + " " + nA + " " + nC);
        if ((nA>nC)&&(nC>nB)) System.out.println(nA + " " + nC + " " + nB);
        if ((nC>nA)&&(nA>nB)) System.out.println(nC + " " + nA + " " + nB);
        if ((nC>nB)&&(nB>nA)) System.out.println(nC + " " + nB + " " + nA);
        if ((nB>nC)&&(nC>nA)) System.out.println(nB + " " + nC + " " + nA);
        //напишите тут ваш код

    }
}
