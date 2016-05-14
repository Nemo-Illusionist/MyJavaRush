package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner lol = new Scanner(System.in);
        int A[] = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = lol.nextInt();
        }
        Arrays.sort(A);
        System.out.print(A[1]);
    }
}
