package com.javarush.test.level15.lesson12.bonus01;

public class Plane implements Flyable
{
    int pasenger;

    public Plane(int pasenger) {
        this.pasenger = pasenger;
    }

    @Override
    public void fly() {
    }
}
