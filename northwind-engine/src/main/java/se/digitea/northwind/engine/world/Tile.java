package se.digitea.northwind.engine.world;

import se.digitea.northwind.engine.entities.Entity;

import java.util.List;

public interface Tile {
    public List<Entity> getEntities();

    public String getName();
}
