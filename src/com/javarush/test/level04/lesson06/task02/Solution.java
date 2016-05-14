package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner lol = new Scanner(System.in);
        int a1 = lol.nextInt(), a2 = lol.nextInt(), a3 = lol.nextInt(), a4 = lol.nextInt();

        System.out.print(a1>a2&&a1>a3&&a1>a4? a1:(a2>a1&&a2>a3&&a2>a4? a2: (a3>a1&&a3>a2&&a3>a4? a3: a4)));
    }
}
