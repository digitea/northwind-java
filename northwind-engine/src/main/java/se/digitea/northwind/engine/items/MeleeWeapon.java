package se.digitea.northwind.engine.items;

import se.digitea.northwind.engine.core.EquipmentSlot;

public abstract class MeleeWeapon extends Weapon {
    @Override
    public EquipmentSlot getSlot() {
        return EquipmentSlot.MELEE_WEAPON;
    }
}
