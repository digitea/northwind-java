package se.digitea.adventure.engine.world;

import se.digitea.adventure.engine.entities.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyTile implements Tile {
    private final String name;
    private final String description;
    private final List<Entity> entities = new ArrayList<>();

    public EmptyTile(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public List<Entity> getEntities() {
        return Collections.unmodifiableList(entities);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
