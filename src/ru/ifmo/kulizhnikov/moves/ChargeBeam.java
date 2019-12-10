package ru.ifmo.kulizhnikov.moves;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, +1).chance(0.7));

    }

    @Override
    protected String describe() {
        return "Charge Beam";
    }
}
