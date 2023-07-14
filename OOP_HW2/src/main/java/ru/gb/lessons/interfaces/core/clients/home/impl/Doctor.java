package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.core.clients.Human;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Human {

    public Doctor(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void heal() {
    }

    ;

    @Override
    public void getIll() {
    }

    ;

    public List<Doctor> getDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        for (Doctor doctor : doctors) {
            doctors.add((Doctor) doctor);
        }
        return doctors;
    }

    @Override
    public String toString() {
        return String.format("ФИО : %s", this.getName());
    }
}
