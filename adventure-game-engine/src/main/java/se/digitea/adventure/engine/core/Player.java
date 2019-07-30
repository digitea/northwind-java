package se.digitea.adventure.engine.core;

import se.digitea.adventure.engine.entities.Entity;
import se.digitea.adventure.engine.entities.Stats;
import se.digitea.adventure.engine.items.Item;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Player implements Entity {
    private Stats stats = new Stats(10, 1);
    private final List<Item> items = new ArrayList<>();
    private Point position;
    private EntityName name;

    public Player(String name, Point position) {
        this.name = new EntityName(name);
        this.position = position;
    }

    @Override
    public Stats getStats() {
        return stats;
    }

    @Override
    public Faction getFaction() {
        return new Faction("Player", false);
    }

    public String getName() {
        return name.toString();
    }

    public String getDescription() {
        return "This is you.";
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}
