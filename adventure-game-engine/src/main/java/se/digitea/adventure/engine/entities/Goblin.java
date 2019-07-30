package se.digitea.adventure.engine.entities;

import se.digitea.adventure.engine.core.Faction;
import se.digitea.adventure.engine.core.Lootable;
import se.digitea.adventure.engine.core.StandardFactions;
import se.digitea.adventure.engine.items.Item;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Goblin implements Lootable, Entity {
    private final String name;
    private final String description;
    private final Stats stats;

    public Goblin(String name) {
        this(name, "It's a hideous goblin.", new Stats(
            ThreadLocalRandom.current().nextInt(2, 6),
            ThreadLocalRandom.current().nextInt(1, 3)
        ));
    }

    public Goblin(String name, String description, Stats stats) {
        this.name = name;
        this.description = description;
        this.stats = stats;
    }

    @Override
    public Stats getStats() {
        return stats;
    }

    @Override
    public Faction getFaction() {
        return StandardFactions.GOBLINS;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public List<Item> loot() {
        return Collections.emptyList();
    }
}
