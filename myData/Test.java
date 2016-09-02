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
        Integer[] test = new Integer[7];
        test[0] = 6;
        test[1] = 7;
        test[2] = 8;
        test[3] = 2323;
        test[4] = 1011;
        test[5] = 5;
        test[6] = 1;
        /// не работает!!!!вапвапва
        ///новый коммент

        for (int i = 0; i <5 ; i++)
        {
            System.out.println(test[i]);
        }
/*
    public ArrayList<Integer> toArray(Integer[] test)
    {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 5; i++) ;
        {
            array.add(test[i]);
        }


    }
*/
        int temp =test[0];
        for (int i = 0; i <test.length-1 ; i++)
        {

            for (int j = i +1; j <test.length ; j++)
            {

                if (test[i] > test[j])
                {test[j] = temp;

                    test[j] = test[i];
                    test[i] = temp;

                }
            }

        }

        for (int i = 0; i <test.length ; i++)
        {
            System.out.print(test[i] + " ");
        }

        ArrayList<Integer> array1 = new ArrayList<>();



      for (int i = 0; i <array1.size() ; i++)
        {
            System.out.print(array1.get(i) + " ");

        }

    // System.out.println(test.length);


}
}


