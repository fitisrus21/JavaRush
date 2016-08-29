package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

       ArrayList<Human> c1 = new ArrayList<>();
        ArrayList<Human> c2 = new ArrayList<>();
        ArrayList<Human> c3 = new ArrayList<>();

        Human ch1 = new Human("М",true, 5, c1);
        Human ch2 = new Human("Ми",false, 6, c2);
        Human ch3 = new Human("Мша",false, 7, c3);
        ArrayList<Human> ch = new ArrayList<>();
        ch.add(ch1);
        ch.add(ch2);
        ch.add(ch3);


        Human dad = new Human("Миша", true, 32, ch);
        ArrayList<Human> d =new ArrayList<>();
        d.add(dad);

        Human mom = new Human("Ирина",false, 29,ch);
        ArrayList<Human> m =new ArrayList<>();
        m.add(mom);

        Human olddad1 = new Human("Петя",true, 61, d);
        Human olddad2 = new Human("Вася",true, 61, m);

        Human oldmom1 = new Human("Оля",true, 61, d);
        Human oldmom2 = new Human("Катя",true, 61, m);

        System.out.println(olddad1);
        System.out.println(olddad2);
        System.out.println(oldmom1);
        System.out.println(oldmom2);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);






        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

       public Human( String name, boolean sex, int age, ArrayList children){
           this.name = name;
           this.sex = sex;
           this.age = age;
           this.children = children;
       }


        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
