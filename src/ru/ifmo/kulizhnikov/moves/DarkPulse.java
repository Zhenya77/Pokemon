package ru.ifmo.kulizhnikov.moves;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {
    public DarkPulse() {
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().chance(0.2);
        effect.flinch(p);
        p.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "Dark Pulse";
    }
}
