package ru.ifmo.kulizhnikov.pokemons;

import ru.ifmo.kulizhnikov.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Raikou extends Pokemon {
    public Raikou() {
        this("Raikou", 1);
    }

    public Raikou(String name, int level) {
        super(name, level);
        this.setType(Type.ELECTRIC);
        this.setStats(90, 85, 75, 115, 100, 115);
        this.addMove(new WaterGun());
        this.addMove(new Facade());
        this.addMove(new Waterfall());
        this.addMove(new Swift());
    }
}