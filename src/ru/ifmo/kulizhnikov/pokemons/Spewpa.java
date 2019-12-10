package ru.ifmo.kulizhnikov.pokemons;

import ru.ifmo.kulizhnikov.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spewpa extends Scatterbug {
    public Spewpa() {
        this("Spewpa", 1);
    }

    public Spewpa(String name, int level) {
        super(name, level);
        this.setType(Type.BUG);
        this.setStats(45, 22, 60, 27, 30, 29);
        this.addMove(new Rest());
        this.addMove(new Facade());
        this.addMove(new Leer());
    }
}