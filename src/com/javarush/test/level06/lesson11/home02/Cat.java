package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    public Cat() {
    }
    //напишите тут ваш код
    public static ArrayList<Cat> cats;

    public static void main(String[] args) {
        cats = new ArrayList<Cat>();
        //Создай тут 10 котов
        Cat cat1 = new Cat();
        Cat.cats.add(cat1);
        Cat cat2 = new Cat();
        Cat.cats.add(cat2);
        Cat cat3 = new Cat();
        Cat.cats.add(cat3);
        Cat cat4 = new Cat();
        Cat.cats.add(cat4);
        Cat cat5 = new Cat();
        Cat.cats.add(cat5);
        Cat cat6 = new Cat();
        Cat.cats.add(cat6);
        Cat cat7 = new Cat();
        Cat.cats.add(cat7);
        Cat cat8 = new Cat();
        Cat.cats.add(cat8);
        Cat cat9 = new Cat();
        Cat.cats.add(cat9);
        Cat cat10 = new Cat();
        Cat.cats.add(cat10);
        printCats();
    }

    public static void printCats() {
        //Добавь свой код для пункта 3 тут
        for (Cat x : Cat.cats){
            System.out.println(x);
        }
    }
}
