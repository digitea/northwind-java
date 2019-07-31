package se.digitea.adventure.enchantments;

import se.digitea.adventure.engine.contracts.Enchantment;
import se.digitea.adventure.engine.entities.Entity;

import java.util.Optional;

public class Sharp implements Enchantment {
    @Override
    public void whenUsed(Entity owner, Optional<Entity> target) {
        target.ifPresent(entity -> entity.getStats().removeHealth(1));
    }
}
