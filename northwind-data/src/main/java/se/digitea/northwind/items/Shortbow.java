package se.digitea.northwind.items;

import se.digitea.northwind.engine.annotations.Description;
import se.digitea.northwind.engine.annotations.Name;
import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.items.MeleeWeapon;

@Name("Shortbow")
@Description("Once drawn, the damage is quite substantial.")
public class Shortbow extends MeleeWeapon {
    @Override
    public int getDamage(Entity attacker, Entity target) {
        return 3;
    }
}
