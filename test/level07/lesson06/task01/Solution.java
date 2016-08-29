package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("sldkfjsld");
        list.add("sldkfjs");
        list.add("sldkf");
        list.add("sld");
        list.add("sl");
        int l = list.size();
        System.out.println(l);

        for (int i = 0; i < l; i++)
            System.out.println(list.get(i));



        //напишите тут ваш код

    }
}
