package se.digitea.adventure.items;

import se.digitea.adventure.engine.annotations.Description;
import se.digitea.adventure.engine.annotations.Name;
import se.digitea.adventure.engine.contracts.Consumable;
import se.digitea.adventure.engine.entities.Entity;
import se.digitea.adventure.engine.items.Item;

@Name("Cooked Pork")
@Description("It's full of energy.")
public class CookedPork extends Item implements Consumable {
    @Override
    public void consume(Entity consumer) {
        consumer.getStats().addHealth(4);
    }
}
