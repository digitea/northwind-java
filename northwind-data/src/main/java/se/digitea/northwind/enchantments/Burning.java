package se.digitea.northwind.enchantments;

import se.digitea.northwind.engine.contracts.Enchantment;
import se.digitea.northwind.engine.entities.Entity;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class Burning implements Enchantment {
    @Override
    public void whenUsed(Entity owner, Optional<Entity> target) {
        target.ifPresent(entity -> entity.addEffect(new se.digitea.northwind.effects.Burning(ThreadLocalRandom.current().nextInt(2))));
    }
}
