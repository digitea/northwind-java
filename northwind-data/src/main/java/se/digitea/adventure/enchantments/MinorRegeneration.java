package se.digitea.adventure.enchantments;

import se.digitea.adventure.engine.contracts.Enchantment;
import se.digitea.adventure.engine.entities.Entity;

public class MinorRegeneration implements Enchantment {

    @Override
    public void whenEquipped(Entity owner) {
        owner.getStats().addHealth(1);
    }
}
