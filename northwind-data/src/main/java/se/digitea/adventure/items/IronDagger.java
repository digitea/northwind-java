package se.digitea.adventure.items;

import se.digitea.adventure.engine.annotations.Description;
import se.digitea.adventure.engine.annotations.Name;
import se.digitea.adventure.engine.entities.Entity;
import se.digitea.adventure.engine.items.MeleeWeapon;

@Name("Iron Dagger")
@Description("It's a weapon, but it isn't that good.")
public class IronDagger extends MeleeWeapon {
    @Override
    public int getDamage(Entity attacker, Entity target) {
        return attacker.getStats().getStrength() + 2;
    }
}
