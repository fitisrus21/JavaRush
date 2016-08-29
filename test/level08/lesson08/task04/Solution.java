package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{


    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Бузова", new Date("JULY 1 1981"));
        map.put("Светлаков", new Date("AUGUST 1 1982"));
        map.put("Гончаров", new Date("SEPTEMBER 1 1983"));
        map.put("Кличко", new Date("NOVEMBER 1 1984"));
        map.put("Ли", new Date("DECEMBER 1 1985"));
        map.put("Капоне", new Date("JANUARY 1 1986"));
        map.put("Торчилетти", new Date("JUNE 1 1987"));
        map.put("Гамлет", new Date("FEBRUARY 1 1988"));
        map.put("Ермолаев", new Date("JUNE 1 1989"));

        //напишите тут ваш код
return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
       // HashMap<String, Date> map = new HashMap<map(String, Date>();

       /* Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {*/
            //получение «пары» элементов
           /* HashMap.Entry<String, Date> pair = iterator.next();

            int month = pair.getValue().getMonth() + 1;
            if (month == 6 || month == 7 || month == 8)
                map.remove(pair.getKey(), pair.getValue());*/



            for(Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Date> pair = it.next();
            if(pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7) {
                it.remove();
            }


        }

    }
}
