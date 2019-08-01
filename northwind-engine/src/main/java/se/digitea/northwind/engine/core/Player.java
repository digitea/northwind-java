package se.digitea.northwind.engine.core;

import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.items.Item;
import se.digitea.northwind.engine.templating.DeathText;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
public class Player extends Entity {
    private final List<Item> items = new ArrayList<>();
    private Point position;

    public Player(String name, Point position) {
        super(new EntityName(name), "The player.", new Stats(10, 2), new LootTable(Collections.emptyList()));
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}
