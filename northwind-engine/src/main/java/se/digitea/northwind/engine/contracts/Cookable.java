package se.digitea.northwind.engine.contracts;

import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.items.Item;

import java.util.List;

public interface Cookable {
    List<Item> cook(Entity chef);
}
