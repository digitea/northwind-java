package se.digitea.adventure.engine.effects;

import se.digitea.adventure.engine.core.Nameable;
import se.digitea.adventure.engine.entities.Entity;

public interface Effect extends Nameable {
    public void applyTo(Entity entity);
}
