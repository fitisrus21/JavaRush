package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{


    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Петя");
        map.put("Петров", "Саша");
        map.put("Ермолаев", "Миша");
        map.put("Денисов", "Дима");
        map.put("Карпенко", "Сергей");
        map.put("Шульга", "Сергей");
        map.put("Иванов1", "Петя");
        map.put("Иванов2", "Петя");
        map.put("Иванов3", "Петя");
        map.put("Иванов4", "Петя");


        return map;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getValue().equals(name)){count+=1;}
        }
          return count;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count2 = 0;

        for (Map.Entry<String, String> pair : map.entrySet())
        { if (pair.getKey().equals(lastName)) {count2+=1;}

        }
        return count2;
        //напишите тут ваш код

    }
}
