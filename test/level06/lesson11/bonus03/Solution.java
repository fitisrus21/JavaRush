package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[5];

        for (int i=0; i < 5; i++){
            int n = Integer.parseInt(reader.readLine());
            num[i]= n;


        }
        Arrays.sort(num);
//Выводим отсортированный массив на консоль.
        for(int i = 0; i <  num.length; i++) {
            System.out.print(num[i] + "  ");
        }

        /*for (int i=0; i < 5; i++){
        System.out.print(num[i] + " ");}*/
        //напишите тут ваш код
    }
}
