package ru.ifmo.kulizhnikov.moves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {

    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, -1).chance(0.2));
    }

    @Override
    protected String describe() {
        return "Shadow Ball";
    }
}
