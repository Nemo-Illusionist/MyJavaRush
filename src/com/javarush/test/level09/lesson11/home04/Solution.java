package com.javarush.test.level09.lesson11.home04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date date = new Date(scanner.nextLine());
        SimpleDateFormat df = new SimpleDateFormat("MMM d, yyyy",  Locale.ENGLISH );
        String s = df.format(date).toUpperCase();
        System.out.println(s);
    }
}
