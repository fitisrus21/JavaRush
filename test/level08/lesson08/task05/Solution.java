package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{


    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("выпва", "вапва");
        map.put("вчсмрол", "ывпавапр");
        map.put("варорпа", "варапрап");
        map.put("счпваро", "саряывка");
        map.put("чарогрп", "ывупаврар");
        map.put("пвап", "вап");
        map.put("а", "в");
        map.put("арапо", "вапрвпо");
        map.put("варааыв", "в");
        map.put("вапвапр", "сарапрап");

        return map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<>(map);

         for (Map.Entry<String, String> pair: copy.entrySet())
         {
             int count = 0;
             for (Map.Entry<String, String> x: map.entrySet())
             {
                if (pair.getValue().equals(x.getValue()))
                {
                    count += 1;
                }


            }
             if (count > 1)
             {
                 removeItemFromMapByValue(map, pair.getValue());
             }
        }


        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
