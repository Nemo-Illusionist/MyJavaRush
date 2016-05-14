package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры Имя и два числа, вывести надпись:
name1 получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner lol = new Scanner(System.in);
        String name1 = lol.nextLine(), a1 = lol.nextLine(), a2 = lol.nextLine();
        System.out.print(name1 + " получает " + a1 + " через " + a2 + " лет.");
    }
}