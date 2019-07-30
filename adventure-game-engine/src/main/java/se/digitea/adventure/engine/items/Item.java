package se.digitea.adventure.engine.items;

import se.digitea.adventure.engine.core.Nameable;
import se.digitea.adventure.engine.effects.Effect;

import java.util.List;

public interface Item extends Nameable {
    public List<Effect> getEffects();

    public void addEffect(Effect effect);
}
