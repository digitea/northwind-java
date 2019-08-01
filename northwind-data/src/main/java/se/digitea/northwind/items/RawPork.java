package se.digitea.northwind.items;

import se.digitea.northwind.engine.annotations.Description;
import se.digitea.northwind.engine.annotations.Name;
import se.digitea.northwind.engine.contracts.Consumable;
import se.digitea.northwind.engine.contracts.Cookable;
import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.items.Item;

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
