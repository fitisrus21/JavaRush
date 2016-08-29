package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        public String name;
        public String secondName;
        public String city;
        public int age;
        public int height;
        public int random;

        public  Human(String name, String secondName, String city, int age, int height, int random)
        {
            this.name = name;
            this.secondName = secondName;
            this.city = city;
            this.age = age;
            this.height = height;
            this.random = random;

        }

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String secondName, String city)
        {
            this.secondName = secondName;
            this.city = city;
        }

        public Human(int age)
        {
            this.age = age;
        }

        public Human(String name, String secondName, String city)
        {
            this.name = name;
            this.secondName = secondName;
            this.city = city;
        }

        public Human(int age, int height, int random)
        {
            this.age = age;
            this.height = height;
            this.random = random;
        }

        public Human(String secondName, String city, int age, int height, int random)
        {
            this.secondName = secondName;
            this.city = city;
            this.age = age;
            this.height = height;
            this.random = random;
        }

        public Human(String name, String secondName, String city, int age, int height)
        {
            this.name = name;
            this.secondName = secondName;
            this.city = city;
            this.age = age;
            this.height = height;
        }

        public Human(String city, int age, int height, int random)
        {
            this.city = city;
            this.age = age;
            this.height = height;
            this.random = random;
        }

        public Human(String name, String secondName, String city, int age)
        {
            this.name = name;
            this.secondName = secondName;
            this.city = city;
            this.age = age;
        }
        //напишите тут ваши переменные и конструкторы
    }
}
