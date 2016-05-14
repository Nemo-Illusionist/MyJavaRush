package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> S = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            S.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++)
        {
            S.add(0, S.get(4));
            S.remove(5);
        }
        for (String lol: S){
            System.out.println(lol);
        }
    }
}
