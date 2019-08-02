package se.digitea.northwind.engine.core;

import se.digitea.northwind.engine.annotations.DeathText;
import se.digitea.northwind.engine.annotations.Stats;
import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.items.Item;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@DeathText(cause = DeathCause.ANY, value = {
    "And so ends the life of ${player.name}.",
    "The light fades away for ${player.name}. Death has come.",
    "The warmth of life leaves the body of ${player.name}.",
    "Hope fades away as ${player.name} dies."
})
@DeathText(cause = DeathCause.POISON, value = {
    "The lingering bite of poison would never leave ${player.name}. Death is painful.",
    "The numbness goes away as ${player.name} fades out of existence."
})
@Stats(health = 10, strength = 2)
public class Player extends Entity {
    private final List<Item> items = new ArrayList<>();
    private Point position;

    public Player(String name, Point position) {
        super();
        this.name = new EntityName(name);
        // super(new EntityName(name), "The player.", new Stats(10, 2), new LootTable(Collections.emptyList()));
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Map<String, String> getTextTemplateValues() {
        return Map.of(
            "player.name", name.toString(),
            "player.stats.health", Integer.toString(getStats().getHealth()),
            "player.stats.maxHealth", Integer.toString(getStats().getMaxHealth()),
            "player.stats.strength", Integer.toString(getStats().getStrength())
        );
    }
}
