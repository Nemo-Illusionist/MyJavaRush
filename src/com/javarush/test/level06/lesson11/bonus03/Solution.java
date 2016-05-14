package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner lol = new Scanner(System.in);
        int[] list = new int[5];
        for (int i = 0; i < 5; i++) {
            list[i] = lol.nextInt();
        }
        Arrays.sort(list);
        for (int LOL: list){
            System.out.println(LOL);
        }
    }
}
