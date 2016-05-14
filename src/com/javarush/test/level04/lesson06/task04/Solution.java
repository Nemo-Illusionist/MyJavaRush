package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String name1, name2;
        Scanner lol = new Scanner(System.in);
        name1 = lol.nextLine();
        name2 = lol.nextLine();
        if (name1.equals(name2))
            System.out.print("Имена идентичны");
        else if (name1.length() == name2.length())
            System.out.print("Длины имен равны");
    }
}
