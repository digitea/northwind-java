package se.digitea.northwind.enchantments;

import se.digitea.northwind.engine.contracts.Enchantment;
import se.digitea.northwind.engine.entities.Entity;

import java.util.Optional;

public class RazorSharp implements Enchantment {
    @Override
    public void whenUsed(Entity owner, Optional<Entity> target) {
        target.ifPresent(entity -> entity.getStats().removeHealth(2));
    }
}
