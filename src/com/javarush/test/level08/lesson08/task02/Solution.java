package com.javarush.test.level08.lesson08.task02;

import java.util.*;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet<Integer> set = removeAllNumbersMoreThan10(createSet());
        for (int lol: set){
            System.out.println(lol);
        }
    }

    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
        {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (int lol : set){
            if (lol <= 10) {
                set1.add(lol);
            }
        }
        return set1;
    }
}
