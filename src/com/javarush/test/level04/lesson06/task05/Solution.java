package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner lol = new Scanner(System.in);
        String name = lol.nextLine();
        int age = lol.nextInt();
        if (age<18)
        {
            System.out.print("Подрасти еще");
        }

    }
}
