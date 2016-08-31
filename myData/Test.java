package com.javarush.JavaRush.myData;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Михаил on 28.08.2016.
 */
public class Test
{
    public static void main(String[] args)
    {
        Integer[] test = new Integer[5];
        test[0] = 6;
        test[1] = 7;
        test[2] = 8;
        test[3] = 2323;
        test[4] = 1011;
        /// не работает!!!!вапвапва

        ArrayList<Integer> array1 = new ArrayList<>();
        array1.toArray(test);
        array1.add(5);



        for (Integer x : array1)
        {
            System.out.println(x);
        }
        System.out.println(array1.size());

       // System.out.println(test.length);


    }



    public ArrayList<Integer> toArray(Integer[] test1)
    {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            array.add(test1[i]);
            System.out.println("ntcn");
        }

        return array;
    }




}
