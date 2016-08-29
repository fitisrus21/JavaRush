package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String sA = reader.readLine();
        int nA = Integer.parseInt(sA);

        String sB = reader.readLine();
        int nB = Integer.parseInt(sB);

        String sC = reader.readLine();
        int nC = Integer.parseInt(sC);


        if ((nA >0)&&(nB>0)&&(nC>0))
        {System.out.println("количество отрицательных чисел: 0");
         System.out.println("количество положительных чисел: 3");}

        if ((nA <0)&&(nB<0)&&(nC<0))
        {System.out.println("количество отрицательных чисел: 3");
         System.out.println("количество положительных чисел: 0");}

        if (((nA <0)&&(nB<0)&&(nC>0))||(nA <0)&&(nB>0)&&(nC<0)||(nA >0)&&(nB<0)&&(nC<0))
        {System.out.println("количество отрицательных чисел: 2");
         System.out.println("количество положительных чисел: 1");}

            if (((nA <0)&&(nB>0)&&(nC>0))||(nA >0)&&(nB>0)&&(nC<0)||(nA >0)&&(nB<0)&&(nC>0))
            {System.out.println("количество отрицательных чисел: 1");
             System.out.println("количество положительных чисел: 2");}

    }
}
