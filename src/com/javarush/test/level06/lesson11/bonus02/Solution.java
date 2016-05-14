package com.javarush.test.level06.lesson11.bonus02;

import java.io.IOException;
import java.util.Scanner;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner lol = new Scanner(System.in);
        Cat catGrandFather = new Cat(lol.nextLine());
        Cat catGrandMother = new Cat(lol.nextLine());
        Cat catFather = new Cat(lol.nextLine(), catGrandFather, null);
        Cat catMother = new Cat(lol.nextLine(), null, catGrandMother);
        Cat catSon = new Cat(lol.nextLine(), catFather, catMother);
        Cat catDaughter = new Cat(lol.nextLine(), catFather, catMother);
        System.out.println(catGrandFather.toString());
        System.out.println(catGrandMother.toString());
        System.out.println(catFather.toString());
        System.out.println(catMother.toString());
        System.out.println(catSon.toString());
        System.out.println(catDaughter.toString());
    }

    public static class Cat
    {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name, Cat father, Cat mother)
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        Cat(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            String S = "Cat name is " + name;
            if (mother != null)
                S += ", mother is " + mother.name;
            else
                S += ", no mother";
            if (father != null)
                S += ", father is " + father.name;
            else
                S += ", no father";
            return S;
        }
    }
}
