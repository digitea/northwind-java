package se.digitea.northwind.items;

import se.digitea.northwind.engine.annotations.Description;
import se.digitea.northwind.engine.annotations.Name;
import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.items.MeleeWeapon;

@Name("Iron Dagger")
@Description("It's a weapon, but it isn't that good.")
public class IronDagger extends MeleeWeapon {
    @Override
    public int getDamage(Entity attacker, Entity target) {
        return attacker.getStats().getStrength() + 2;
    }
}
