package com.javarush.test.level05.lesson12.home05;
/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String lol = reader.readLine();
        String lol2 = "сумма";
        int summ=0;
        while (lol.equals(lol2) == false){
            summ+=Integer.parseInt(lol);
            lol = reader.readLine();
        }
        System.out.print(summ);
    }
}
