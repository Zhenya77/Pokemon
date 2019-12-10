package ru.ifmo.kulizhnikov.moves;

import ru.ifmo.se.pokemon.*;

public class Swift extends SpecialMove {

    public Swift() {
        super(Type.NORMAL, 60, 100);
    }

    @Override
    protected String describe() {
        return "Swift";
    }
}
