package se.digitea.adventure.engine.items;

import se.digitea.adventure.engine.effects.Effect;
import se.digitea.adventure.engine.entities.Entity;

import java.util.ArrayList;
import java.util.List;

public class Weapon implements Item {
    private final String name;
    private final String description;
    private final int baseDamage;
    private final List<Effect> effects = new ArrayList<>();

    public Weapon(String name, String description, int baseDamage) {
        this.name = name;
        this.description = description;
        this.baseDamage = baseDamage;
    }

    @Override
    public List<Effect> getEffects() {
        return effects;
    }

    @Override
    public void addEffect(Effect effect) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public int getDamage(Entity attacker, Entity target) {
        return baseDamage + attacker.getStats().getStrength();
    }
}
