package se.digitea.adventure.engine.contracts;

import se.digitea.adventure.engine.core.EquipmentSlot;

import java.util.Collections;
import java.util.List;

public interface Equipable {
    EquipmentSlot getSlot();

    default List<EntityEffect> getEquippedEffects() {
        return Collections.emptyList();
    }
}
