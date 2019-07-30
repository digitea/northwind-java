package se.digitea.adventure.engine.effects;

import se.digitea.adventure.engine.entities.Entity;

public class Poison implements Effect {
    private final String name;
    private final String description;
    private final int damage;

    public Poison(String name, String description, int damage) {
        this.damage = damage;
        this.name = name;
        this.description = description;
    }

    @Override
    public void applyTo(Entity entity) {
        entity.getStats().setHealth(entity.getStats().getHealth() - damage);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
