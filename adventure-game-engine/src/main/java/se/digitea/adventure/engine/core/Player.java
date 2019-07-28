package se.digitea.adventure.engine.core;

import se.digitea.adventure.engine.entities.Entity;
import se.digitea.adventure.engine.items.Item;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Player implements Entity {
    private final List<Item> items = new ArrayList<>();
    private Point position;
    private EntityName name;

    public Player(String name, Point position) {
        this.name = new EntityName(name);
        this.position = position;
    }

    @Override
    public Faction getFaction() {
        return new Faction("Player", false);
    }

    @Override
    public Trait[] getTraits() {
        return new Trait[]{
                Trait.DAMAGEABLE
        };
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
