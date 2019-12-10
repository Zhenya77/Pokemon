package ru.ifmo.kulizhnikov.moves;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (p.getCondition() == Status.SLEEP) {
            p.addEffect(new Effect().attack(this.power));
        }
    }

    @Override
    protected String describe() {
        return "Dream Eater";
    }
}
