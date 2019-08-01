package se.digitea.northwind.engine.entities;

import se.digitea.northwind.engine.annotations.Description;
import se.digitea.northwind.engine.annotations.Name;
import se.digitea.northwind.engine.annotations.Stats;
import se.digitea.northwind.engine.contracts.Lootable;
import se.digitea.northwind.engine.core.EntityName;
import se.digitea.northwind.engine.core.LootTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Entity implements Lootable {
    protected EntityName name;
    private final String description;
    private final se.digitea.northwind.engine.core.Stats stats;
    private final List<EntityEffect> effects = new ArrayList<>();
    private final LootTable lootTable;

    public Entity() {
        this.name = new EntityName(getClass().getAnnotation(Name.class).value());

        Description[] descriptionAnnotations = getClass().getAnnotationsByType(Description.class);
        this.description = descriptionAnnotations[ThreadLocalRandom.current().nextInt(descriptionAnnotations.length)].value();

        Stats statsAnnotation = getClass().getAnnotation(Stats.class);
        this.stats = new se.digitea.northwind.engine.core.Stats(statsAnnotation.health(), statsAnnotation.health());
        this.lootTable = new LootTable(Collections.emptyList());
    }

    public String getName() {
        return name.toString();
    }

    public String getDescription() {
        return description;
    }

    public se.digitea.northwind.engine.core.Stats getStats() {
        return stats;
    }

    @Override
    public LootTable getLootTable() {
        return lootTable;
    }

    public void addEffect(EntityEffect effect) {
        effects.add(effect);
    }
}
