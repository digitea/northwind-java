package se.digitea.adventure.engine.contracts;

import se.digitea.adventure.engine.core.EquipmentSlot;
import se.digitea.adventure.engine.core.Effect;

import java.util.Collections;
import java.util.List;

public interface Equipable {
    EquipmentSlot getSlot();

    default List<Effect> getEquippedEffects() {
        return Collections.emptyList();
    }
}
