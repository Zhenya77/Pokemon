package ru.ifmo.kulizhnikov.moves;

import ru.ifmo.se.pokemon.*;

public class WaterGun extends SpecialMove {
    public WaterGun() {
        super(Type.WATER, 40, 100);
    }

    @Override
    protected String describe() {
        return "Water Gun";
    }
}
