package se.digitea.northwind.engine.entities;

public interface EntityEffect {
    default void onTick(Entity entity) {
    }

    default void onAdded(Entity entity) {
    }

    default void onRemoved(Entity entity) {
    }
}
