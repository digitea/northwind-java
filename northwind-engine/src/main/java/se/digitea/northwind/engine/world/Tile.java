package se.digitea.northwind.engine.world;

import se.digitea.northwind.engine.entities.Entity;

import java.util.List;

public interface Tile extends Nameable {
    public List<Entity> getEntities();
}
