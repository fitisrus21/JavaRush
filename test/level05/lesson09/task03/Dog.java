package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    public String name;
    public int weight;
    public String color;

    public Dog(String name)
    {
        this.name = name;
    }

    public  Dog(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public Dog(String name, int weight, String color)
    {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
    //напишите тут ваш код

}
