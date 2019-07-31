package se.digitea.adventure.engine.entities;

import se.digitea.adventure.engine.annotations.Description;
import se.digitea.adventure.engine.annotations.Name;
import se.digitea.adventure.engine.annotations.Stats;
import se.digitea.adventure.engine.contracts.Lootable;
import se.digitea.adventure.engine.core.EntityName;
import se.digitea.adventure.engine.core.LootTable;

import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Entity implements Lootable {
    private final EntityName name;
    private final String description;
    private final se.digitea.adventure.engine.core.Stats stats;
    private final LootTable lootTable;

    public Entity() {
        this.name = new EntityName(getClass().getAnnotation(Name.class).value());

        Description[] descriptionAnnotations = getClass().getAnnotationsByType(Description.class);
        this.description = descriptionAnnotations[ThreadLocalRandom.current().nextInt(descriptionAnnotations.length)].value();

        Stats statsAnnotation = getClass().getAnnotation(Stats.class);
        this.stats = new se.digitea.adventure.engine.core.Stats(statsAnnotation.health(), statsAnnotation.health());
        this.lootTable = new LootTable(Collections.emptyList());
    }

    public String getName() {
        return name.toString();
    }

    public String getDescription() {
        return description;
    }

    public se.digitea.adventure.engine.core.Stats getStats() {
        return stats;
    }

    @Override
    public LootTable getLootTable() {
        return lootTable;
    }
}
