package se.digitea.adventure.items;

import se.digitea.adventure.engine.annotations.Description;
import se.digitea.adventure.engine.annotations.Name;
import se.digitea.adventure.engine.entities.Entity;
import se.digitea.adventure.engine.items.MeleeWeapon;

@Name("Shortbow")
@Description("Once drawn, the damage is quite substantial.")
public class Shortbow extends MeleeWeapon {
    @Override
    public int getDamage(Entity attacker, Entity target) {
        return 3;
    }
}
