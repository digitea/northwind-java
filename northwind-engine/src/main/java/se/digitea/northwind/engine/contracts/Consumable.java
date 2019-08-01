package se.digitea.northwind.engine.contracts;

import se.digitea.northwind.engine.entities.Entity;

public interface Consumable {
    void consume(Entity consumer);
}
