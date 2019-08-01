package se.digitea.northwind.engine.contracts;

import se.digitea.northwind.engine.core.EquipmentSlot;
import se.digitea.northwind.engine.entities.EntityEffect;

import java.util.Collections;
import java.util.List;

public interface Equipable {
    EquipmentSlot getSlot();

    default List<EntityEffect> getEquippedEffects() {
        return Collections.emptyList();
    }
}
