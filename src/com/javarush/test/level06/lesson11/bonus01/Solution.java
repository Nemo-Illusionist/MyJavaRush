package com.javarush.test.level06.lesson11.bonus01;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25»
*/

import java.io.IOException;
import java.util.Scanner;

public class Solution
{
    public static int max = 100;
    public static void main(String[] args) throws IOException
    {
        Scanner reader  = new Scanner(System.in);

        String max = "Max is ";
        int a = reader.nextInt();
        int b = reader.nextInt();
        Solution.max = a > b ? a : b;

        System.out.println(max + Solution.max);
    }

}
