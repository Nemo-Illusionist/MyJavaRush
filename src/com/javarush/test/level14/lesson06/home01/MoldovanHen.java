package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Администратор on 07.01.2016.
 */
class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 3;
    }
    @Override
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() + "яиц в месяц.";
    }
}
