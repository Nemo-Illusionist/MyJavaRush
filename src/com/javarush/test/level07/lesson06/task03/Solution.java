package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> S = new ArrayList<String>();
        int l=255;
        for (int i = 0; i < 5; i++) {
            S.add(reader.readLine());
            if (S.get(i).length() < l) {l = S.get(i).length();}
        }
        for (String lol : S){
            if (lol.length() == l){
                System.out.println(lol);
            }
        }

    }
}
