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

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        Human lol1 = new Human("lol1", true, 80);
        Human lol2 = new Human("lol2", false, 80);
        Human lol3 = new Human("lol3", true, 80);
        Human lol4 = new Human("lol4", false, 80);
        Human lol5 = new Human("lol5", true, 45, lol1,lol2);
        Human lol6 = new Human("lol6", false, 45, lol3, lol4);
        Human lol7 = new Human("lol7", true, 10, lol5, lol6);
        Human lol8 = new Human("lol8", false, 10, lol5, lol6);
        Human lol9 = new Human("lol9", true, 10, lol5, lol6);
        ArrayList<Human> list = new ArrayList<Human>(Arrays.asList(lol1,lol2,lol3,lol4,lol5,lol6,lol7,lol8,lol9));
        for (Human lol: list){
            System.out.println(lol.toString());
        }
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String toString()
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
