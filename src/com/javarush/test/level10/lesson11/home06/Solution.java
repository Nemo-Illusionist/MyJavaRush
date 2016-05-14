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
        public Human(String name)
        {
            this.name = name;
        }


        public Human(String name, int age, int weight, boolean sex, String eyes, int rost)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.eyes = eyes;
            this.rost = rost;
        }

        String name;
        int age;
        int weight;
        boolean sex;
        String eyes;
        int rost;

        public Human(String name, boolean sex)
        {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String eyes, String name, int age, int weight, boolean sex)
        {
            this.eyes = eyes;
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, int age, int weight, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, int age, int weight)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int rost, boolean sex, String eyes, int weight)
        {
            this.name = name;
            this.rost = rost;
            this.sex = sex;
            this.eyes = eyes;
            this.weight = weight;
        }

        public Human(String name, boolean sex, String eyes, int rost)
        {
            this.name = name;
            this.sex = sex;
            this.eyes = eyes;
            this.rost = rost;
        }

        public Human(String name, int rost, String eyes, int age)
        {
            this.name = name;
            this.rost = rost;
            this.eyes = eyes;
            this.age = age;
        }
    }
}
