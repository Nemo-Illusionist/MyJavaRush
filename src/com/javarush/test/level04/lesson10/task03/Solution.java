package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int i=0;
        BufferedReader reuder = new BufferedReader(new InputStreamReader(System.in));
        String S = reuder.readLine();
        int N = Integer.parseInt(reuder.readLine());
        while (i<N)
        {
            i++;
            System.out.println(S);
        }
    }
}
