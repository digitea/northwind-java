package se.digitea.adventure.engine.core;

import se.digitea.adventure.engine.entities.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyTile implements Tile {
    List<Entity> entities = new ArrayList<>();

    @Override
    public List<Entity> getEntities() {
        return Collections.unmodifiableList(entities);
    }
}
