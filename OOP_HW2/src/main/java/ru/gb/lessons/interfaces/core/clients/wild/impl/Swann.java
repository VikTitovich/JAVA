package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class Swann extends WildAnimal implements Flyable, Runnable, Swimable, Soundable {
    public Swann() {
    }

    @Override
    public void getIll() {

    }

    public Swann(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super();
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "flies at speed 12 km/h");
        return 12;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "walks at a speed 6 km/h");
        return 6;
    }

    @Override
    public void sound() {
        System.out.println(CLASS_NAME + "shouted twice");
    }

    @Override
    public int getSwimingSpeed() {
        System.out.println(CLASS_NAME + "swims at a speed of 4 km/h");
        return 4;
    }
}

