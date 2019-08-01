package se.digitea.northwind.engine.world;

import se.digitea.northwind.engine.entities.Entity;

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

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    @Override
    public List<Entity> getEntities() {
        return Collections.unmodifiableList(entities);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
