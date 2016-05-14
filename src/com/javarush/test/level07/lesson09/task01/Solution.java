package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++){
            A.add(Integer.parseInt(reader.readLine()));
            if (A.get(i)%3 == 0) {a3.add(A.get(i));}
            if (A.get(i)%2 == 0) {a2.add(A.get(i));}
            if ((A.get(i)%3 != 0)&&(A.get(i)%2 != 0)) {a.add(A.get(i));}
        }
        printList(a3);
        printList(a2);
        printList(a);
    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for (int lol: list){
            System.out.println(lol);
        }
    }
}
