package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(NOD(scanner.nextLong(), scanner.nextLong()));
    }

    public static long NOD(long a,long b) {
        while (b !=0) {
            long tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
