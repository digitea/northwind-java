package se.digitea.northwind.engine.items;

import se.digitea.northwind.engine.contracts.Equipable;
import se.digitea.northwind.engine.entities.Entity;

public abstract class Weapon extends Item implements Equipable {
    public abstract int getDamage(Entity attacker, Entity target);
}
