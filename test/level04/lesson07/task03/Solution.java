package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
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


        if ((nA >0)&&(nB>0)&&(nC>0)) System.out.println(3);
        if ((nA <0)&&(nB<0)&&(nC<0)) System.out.println(0);
        if (((nA <0)&&(nB<0)&&(nC>0))||(nA <0)&&(nB>0)&&(nC<0)||(nA >0)&&(nB<0)&&(nC<0)) System.out.println(1);
        if (((nA <0)&&(nB>0)&&(nC>0))||(nA >0)&&(nB>0)&&(nC<0)||(nA >0)&&(nB<0)&&(nC>0)) System.out.println(2);
        //напишите тут ваш код

    }
}
