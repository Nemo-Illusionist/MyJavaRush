package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int A[] = new int[3];
        Scanner lol = new Scanner(System.in);
        A[0] = lol.nextInt();
        A[1] = lol.nextInt();
        A[2] = lol.nextInt();
        Arrays.sort(A);
        for (int i = 2; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }
    }
}
