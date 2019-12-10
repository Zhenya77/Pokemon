package ru.ifmo.kulizhnikov.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.kulizhnikov.moves.ShadowBall;
import ru.ifmo.kulizhnikov.moves.DreamEater;
import ru.ifmo.kulizhnikov.moves.ChargeBeam;

public class Noibat extends Pokemon {
    public Noibat() {
        this("Noibat", 1);
    }

    public Noibat(String name, int level) {
        super(name, level);
        this.setType(Type.FLYING, Type.DRAGON);
        this.setStats(40, 30, 35, 45, 40, 55);
        this.addMove(new ShadowBall());
        this.addMove(new DreamEater());
        this.addMove(new ChargeBeam());
    }
}
