package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.util.Scanner;
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String name, age;
        Scanner lol = new Scanner(System.in);
        age = lol.nextLine();
        name = lol.nextLine();



        System.out.print(name + " захватит мир через " + age + " лет. Му-ха-ха!");

    }
}