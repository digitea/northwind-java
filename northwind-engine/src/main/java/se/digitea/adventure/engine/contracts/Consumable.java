package se.digitea.adventure.engine.contracts;

import se.digitea.adventure.engine.entities.Entity;

public interface Consumable {
    void consume(Entity consumer);
}
