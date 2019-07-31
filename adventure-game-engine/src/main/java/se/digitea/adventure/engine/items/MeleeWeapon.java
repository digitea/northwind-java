package se.digitea.adventure.engine.items;

import se.digitea.adventure.engine.core.EquipmentSlot;

public abstract class MeleeWeapon extends Weapon {
    private final int MELEE_RANGE = 2; // meters

    @Override
    public int getRange() {
        return MELEE_RANGE;
    }

    @Override
    public EquipmentSlot getSlot() {
        return EquipmentSlot.MELEE_WEAPON;
    }
}
