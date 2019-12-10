package ru.ifmo.kulizhnikov.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().condition(Status.SLEEP).turns(2));
        p.addEffect(new Effect().stat(Stat.HP, (int) (p.getStat(Stat.HP) - p.getHP())).turns(2));
    }

    @Override
    protected String describe() {
        return "rest";
    }
}