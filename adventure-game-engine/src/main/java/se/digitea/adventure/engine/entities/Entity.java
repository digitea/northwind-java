package se.digitea.adventure.engine.entities;

import se.digitea.adventure.engine.core.Faction;
import se.digitea.adventure.engine.core.Nameable;

public interface Entity extends Nameable {
    public Stats getStats();

    public Faction getFaction();
}
