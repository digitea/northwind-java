package se.digitea.northwind.effects;

import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.entities.EntityEffect;

public class Burning implements EntityEffect {
    private final int tickingDamage;

    public Burning(int tickingDamage) {
        this.tickingDamage = tickingDamage;
    }

    @Override
    public void onTick(Entity entity) {
        entity.getStats().removeHealth(tickingDamage);
    }
}
