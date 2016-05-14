package com.javarush.test.level04.lesson16.home04;

import java.io.*;
import java.util.Scanner;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner lol = new Scanner(System.in);
        String name = lol.nextLine(), ymd, y = lol.nextLine(), m = lol.nextLine(), d = lol.nextLine();
        ymd = d + "." + m + "." +y;
        System.out.print("Меня зовут " + name + "\nЯ родился " + ymd);
    }
}
