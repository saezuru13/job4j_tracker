package ru.job4j.polymorphism;

public interface Transport {
    double PRICE = 11.20;

    void ride();

    void passengers(int numberOfPassengers);

    default double refuel(int fuel) {
        return fuel * PRICE;
    }
}