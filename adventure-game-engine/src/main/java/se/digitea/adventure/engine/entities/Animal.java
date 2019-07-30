package se.digitea.adventure.engine.entities;

import se.digitea.adventure.engine.core.Faction;
import se.digitea.adventure.engine.core.LootTable;
import se.digitea.adventure.engine.core.Lootable;
import se.digitea.adventure.engine.items.Item;

import java.util.Collections;
import java.util.List;

public class Animal implements Lootable, Entity {
    private final String name;
    private final String description;
    private final Stats stats;
    private final Faction faction;

    public Animal(String name, String description, Stats stats, Faction faction) {
        this.name = name;
        this.description = description;
        this.stats = stats;
        this.faction = faction;
    }

    @Override
    public Stats getStats() {
        return stats;
    }

    @Override
    public Faction getFaction() {
        return faction;
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
    public LootTable getLootTable() {
        return new LootTable(Collections.emptyList());
    }

    @Override
    public List<Item> loot() {
        return Collections.emptyList();
    }
}
