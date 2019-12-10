package ru.ifmo.kulizhnikov.pokemons;

        import ru.ifmo.kulizhnikov.moves.DarkPulse;
        import ru.ifmo.se.pokemon.Pokemon;
        import ru.ifmo.se.pokemon.Type;
        import ru.ifmo.kulizhnikov.moves.ShadowBall;
        import ru.ifmo.kulizhnikov.moves.DreamEater;
        import ru.ifmo.kulizhnikov.moves.ChargeBeam;
        import ru.ifmo.kulizhnikov.moves.DarkPulse;

public class Noivern extends Noibat {
    public Noivern() {
        this("Noivern", 1);
    }

    public Noivern(String name, int level) {
        super(name, level);
        this.setType(Type.FLYING, Type.DRAGON);
        this.setStats(85, 70, 80, 97, 80, 123);
        this.addMove(new ShadowBall());
        this.addMove(new DreamEater());
        this.addMove(new ChargeBeam());
        this.addMove(new DarkPulse());
    }
}