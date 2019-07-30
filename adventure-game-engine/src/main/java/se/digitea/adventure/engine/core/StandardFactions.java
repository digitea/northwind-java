package se.digitea.adventure.engine.core;

public class StandardFactions {
    private StandardFactions() {
        // Private constructor
    }

    public static final Faction GOBLINS = new Faction("Goblins", true);
    public static final Faction PASSIVE_ANIMALS = new Faction("Passive Animals", false);
    public static final Faction HOSTILE_ANIMALS = new Faction("Hostile Animals", true);
}
