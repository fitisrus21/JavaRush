package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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

        String sD = reader.readLine();
        int nD = Integer.parseInt(sD);

        String sC = reader.readLine();
        int nC = Integer.parseInt(sC);

        if ((nA<nB)&&(nC<nB)&&(nD<nB)) System.out.println(nB);
        else if ((nA>nB)&&(nA>nD)&&(nA>nD)) System.out.println(nA);
        else if ((nA<nC)&&(nB<nC)&&(nD<nC)) System.out.println(nC);
        else if ((nA<nD)&&(nC<nD)&&(nB<nD)) System.out.println(nD);

        //else System.out.println(nB);
        //напишите тут ваш код

    }
}
