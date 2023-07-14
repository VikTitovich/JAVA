package ru.gb.lessons.interfaces.core;

import java.lang.Runnable;
import java.util.ArrayList;
import java.util.List;

import ru.gb.lessons.interfaces.core.clients.*;

public class VetClinic {
    private final List<Animal> animals;
    public VetClinic(Human headPhysician) {
        this.animals = new ArrayList<>();
    }

    public List<Runnable> getRunningAnimals() {
        List<Runnable> runningAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Runnable) runningAnimals.add((Runnable) a);

        return runningAnimals;
    }

    public VetClinic() { this(null); }

    public List<Animal> getAllAnimals() { return this.animals; }

    public List<Swimable> getSwimmingAnimals() {
        List<Swimable> swimmingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Swimable) swimmingAnimals.add((Swimable) a);

        return swimmingAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Flyable) flyingAnimals.add((Flyable) a);

        return flyingAnimals;
    }

    public List<Soundable> getSpeakingAnimals() {
        List<Soundable> speakingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Soundable) speakingAnimals.add((Soundable) a);

        return speakingAnimals;
    }
    public VetClinic addAnimal(Animal animal) {
        this.animals.add((Animal) animal);
        return this;
    }
}

