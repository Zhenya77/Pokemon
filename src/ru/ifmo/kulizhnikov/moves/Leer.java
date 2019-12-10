package ru.ifmo.kulizhnikov.moves;

import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {

    public Leer() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.DEFENSE, -1));
    }

    @Override
    protected String describe() {
        return "Leer";
    }
}
