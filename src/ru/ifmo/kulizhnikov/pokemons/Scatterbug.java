package ru.ifmo.kulizhnikov.pokemons;

import ru.ifmo.kulizhnikov.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Scatterbug extends Pokemon {
    public Scatterbug() {
        this("Scatterbug", 1);
    }

    public Scatterbug(String name, int level) {
        super(name, level);
        this.setType(Type.BUG);
        this.setStats(38, 35, 40, 27, 25, 35);
        this.addMove(new Rest());
        this.addMove(new Facade());
    }
}