package se.digitea.adventure.items;

import se.digitea.adventure.enchantments.RazorSharp;
import se.digitea.adventure.enchantments.Sharp;
import se.digitea.adventure.engine.annotations.Description;
import se.digitea.adventure.engine.annotations.Enchantable;
import se.digitea.adventure.engine.annotations.Name;
import se.digitea.adventure.engine.entities.Entity;
import se.digitea.adventure.engine.items.MeleeWeapon;

@Name("Steel Dagger")
@Description("A short but lethally sharp weapon.")
@Enchantable({
        Sharp.class,
        RazorSharp.class
})
public class SteelDagger extends MeleeWeapon {
    @Override
    public int getDamage(Entity attacker, Entity target) {
        return attacker.getStats().getStrength() + 4;
    }
}
