package se.digitea.northwind.effects;

import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.entities.EntityEffect;

public class Exhausted implements EntityEffect {
    private final int strengthDeficit;

    public Exhausted(int strengthDeficit) {
        this.strengthDeficit = strengthDeficit;
    }

    @Override
    public void onTick(Entity entity) {
        entity.getStats().removeStrength(strengthDeficit);
    }
}
