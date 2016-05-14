package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new FileReader(scanner.nextLine()));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (in.ready())
        {
            list.add(Integer.parseInt(in.readLine()));
        }
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            a[i] = list.get(i);
        }
        Arrays.sort(a);
        for (int lol :
                a)
        {
           if (lol%2==0)
               System.out.println(lol);
        }
    }
}
