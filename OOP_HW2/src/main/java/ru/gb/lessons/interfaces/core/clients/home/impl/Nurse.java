package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.core.clients.Human;

import java.util.ArrayList;
import java.util.List;

public class Nurse extends Human {

    public Nurse(String name) {
        super(name);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    public void care() {
    }

    ;

    @Override
    public void getIll() {
    }


    @Override
    public String toString() {
        return String.format("ФИО : %s", this.getName());
    }
}
