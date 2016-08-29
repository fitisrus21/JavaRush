package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args){

        Human olddad1 = new Human("Петя",true,71,null,null );
        Human olddad2 = new Human("Вася",true,72,null,null );

        Human oldmom1 = new Human("Оля",false,61,null,null );
        Human oldmom2 = new Human("Катя",false,62,null,null );

        Human dad =new Human("Витя",true,42,olddad1,oldmom1 );
        Human mom = new Human("Аля",false,41,olddad2,oldmom2 );

        Human kid1 = new Human("Марина",false,10,dad,mom);
        Human kid2 =new Human("Алена",false,9,dad,mom);
        Human kid3 = new Human("ААндрей",true,8,dad,mom);



        System.out.println(olddad1.toString());
        System.out.println(olddad2.toString());
        System.out.println(oldmom1.toString());
        System.out.println(oldmom2.toString());
        System.out.println(dad.toString());
        System.out.println(mom.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());

        //напишите тут ваш код
    }



    public static class Human
    {
          String name;
         boolean sex;
         int age;
         Human father;
         Human mother;

          Human (String name, boolean sex, int age, Human father, Human mother)

        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }



        //напишите тут ваш код

        public   String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }


    }

}
