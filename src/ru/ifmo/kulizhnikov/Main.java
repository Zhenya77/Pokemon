package ru.ifmo.kulizhnikov;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.kulizhnikov.pokemons.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Noibat("Noitbat", 1));
        b.addAlly(new Noivern("Noivern", 1));
        b.addAlly(new Raikou("Raikou", 1));
        b.addFoe(new Scatterbug("Scatterbug", 1));
        b.addFoe(new Spewpa("Spewpa", 1));
        b.addFoe(new Vivillon("Vivillon", 1));

        b.go();
    }
}