package se.digitea.adventure.engine.items;

import se.digitea.adventure.engine.contracts.Equipable;
import se.digitea.adventure.engine.entities.Entity;

public abstract class Weapon extends Item implements Equipable {
    public abstract int getDamage(Entity attacker, Entity target);
}
