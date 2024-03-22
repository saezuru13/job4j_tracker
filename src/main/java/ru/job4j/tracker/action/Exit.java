package ru.job4j.tracker.action;

import ru.job4j.Tracker;
import ru.job4j.tracker.Input;
import ru.job4j.tracker.Output;

public class Exit implements UserAction {
    private final Output output;

    public Exit(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Завершить программу";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Завершение программы ===");
        return false;
    }
}