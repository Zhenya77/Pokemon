package ru.ifmo.kulizhnikov.moves;

import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove {
    public Waterfall() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().chance(0.2);
        effect.flinch(p);
        p.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "Waterfall";
    }
}