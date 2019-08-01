package se.digitea.northwind.items;

import se.digitea.northwind.enchantments.RazorSharp;
import se.digitea.northwind.enchantments.Sharp;
import se.digitea.northwind.engine.annotations.Description;
import se.digitea.northwind.engine.annotations.Enchantable;
import se.digitea.northwind.engine.annotations.Name;
import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.items.MeleeWeapon;

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
