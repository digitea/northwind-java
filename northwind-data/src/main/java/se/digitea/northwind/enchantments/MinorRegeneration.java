package se.digitea.northwind.enchantments;

import se.digitea.northwind.engine.contracts.Enchantment;
import se.digitea.northwind.engine.entities.Entity;

public class MinorRegeneration implements Enchantment {

    @Override
    public void whenEquipped(Entity owner) {
        owner.getStats().addHealth(1);
    }
}
