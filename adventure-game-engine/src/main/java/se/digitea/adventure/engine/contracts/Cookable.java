package se.digitea.adventure.engine.contracts;

import se.digitea.adventure.engine.entities.Entity;
import se.digitea.adventure.engine.items.Item;

import java.util.List;

public interface Cookable {
    List<Item> cook(Entity chef);
}
