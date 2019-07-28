package se.digitea.adventure.engine.entities;

import se.digitea.adventure.engine.core.Nameable;
import se.digitea.adventure.engine.core.Trait;

public interface Entity extends Nameable {
    public Trait[] getTraits();
}
