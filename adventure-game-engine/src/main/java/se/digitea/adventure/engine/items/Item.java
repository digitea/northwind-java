package se.digitea.adventure.engine.items;

import se.digitea.adventure.engine.core.Nameable;
import se.digitea.adventure.engine.effects.Effect;

public interface Item extends Nameable {
    public Effect[] getEffects();
}
