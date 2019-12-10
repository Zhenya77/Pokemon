package ru.ifmo.kulizhnikov.pokemons;

import ru.ifmo.kulizhnikov.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vivillon extends Spewpa {
    public Vivillon() {
        this("Vivillon", 1);
    }

    public Vivillon(String name, int level) {
        super(name, level);
        this.setType(Type.BUG, Type.FLYING);
        this.setStats(80, 52, 50, 90, 50, 89);
        this.addMove(new Rest());
        this.addMove(new Facade());
        this.addMove(new Leer());
        this.addMove(new TakeDown());
    }
}