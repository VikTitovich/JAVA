package ru.gb.lessons.interfaces.core.clients.wild.impl;

import java.time.LocalDate;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runnable, Swimable, Soundable {
    public Duck() {
    }

    @Override
    public void getIll() {

    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "flies at speed 5 km/h");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "walks at a speed 3 km/h");
        return 3;
    }

    @Override
    public void sound() {
        System.out.println(CLASS_NAME + "shouted 5 times");
    }

    @Override
    public int getSwimingSpeed() {
        System.out.println(CLASS_NAME + "swims at a speed of 2 km/h");
        return 2;
    }
}
