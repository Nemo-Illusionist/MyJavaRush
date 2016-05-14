package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.Scanner;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        double S = 0, a=0;
        Scanner lol = new Scanner(System.in);
        for (;a>=0;) {
            a=lol.nextDouble();
            S+=a;
        }
        System.out.print((int)S);
    }
}
