package se.digitea.adventure.engine.items;

import se.digitea.adventure.engine.core.EquipmentSlot;

public abstract class RangedWeapon extends Weapon {
    @Override
    public EquipmentSlot getSlot() {
        return EquipmentSlot.MELEE_WEAPON;
    }
}
