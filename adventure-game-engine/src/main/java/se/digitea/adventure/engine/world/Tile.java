package se.digitea.adventure.engine.world;

import se.digitea.adventure.engine.core.Nameable;
import se.digitea.adventure.engine.entities.Entity;

import java.util.List;

public interface Tile extends Nameable {
    public List<Entity> getEntities();
}
