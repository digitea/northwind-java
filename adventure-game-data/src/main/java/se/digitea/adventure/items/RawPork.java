package se.digitea.adventure.items;

import se.digitea.adventure.engine.annotations.Description;
import se.digitea.adventure.engine.annotations.Name;
import se.digitea.adventure.engine.contracts.Consumable;
import se.digitea.adventure.engine.contracts.Cookable;
import se.digitea.adventure.engine.entities.Entity;
import se.digitea.adventure.engine.items.Item;

import java.util.List;

@Name("Raw Pork")
@Description("It's food, but it's raw.")
public class RawPork extends Item implements Consumable, Cookable {
    @Override
    public void consume(Entity consumer) {
        consumer.getStats().removeHealth(2);
    }

    @Override
    public List<Item> cook(Entity chef) {
        return List.of(new CookedPork());
    }
}
