package ru.ifmo.kulizhnikov.moves;

import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove{

    public TakeDown() {
        super(Type.NORMAL, 90, 85);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.HP, (int) (p.getHP() - 1)));
    }

    @Override
    protected String describe() {
        return "Take Down";
    }
}
