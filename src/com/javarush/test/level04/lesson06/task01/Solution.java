package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner lol = new Scanner(System.in);
        int a1 = lol.nextInt(), a2 = lol.nextInt();
        System.out.print(a1>a2?a2:a1);
    }
}