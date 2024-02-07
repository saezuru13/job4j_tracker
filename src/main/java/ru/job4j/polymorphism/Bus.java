package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Bus is riding.");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println("Bus can accommodate " + numberOfPassengers + " passengers.");
    }

    @Override
    public double refuel(int fuel) {
        return Transport.super.refuel(fuel);
    }

    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.ride();
        bus.passengers(126);
        System.out.println("Price " + bus.refuel(70) + " RUB.");
    }
}