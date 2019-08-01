package se.digitea.northwind.engine.contracts;

import se.digitea.northwind.engine.entities.Entity;

import java.util.Optional;

public interface Enchantment {
    default void whenEquipped(Entity owner) {
    }

    default void whenOwned(Entity owner) {
    }

    default void whenUsed(Entity owner, Optional<Entity> target) {
    }

}
