package se.digitea.northwind.items;

import se.digitea.northwind.engine.annotations.Description;
import se.digitea.northwind.engine.annotations.Name;
import se.digitea.northwind.engine.contracts.Consumable;
import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.items.Item;

@Name("Cooked Pork")
@Description("It's full of energy.")
public class CookedPork extends Item implements Consumable {
    @Override
    public void consume(Entity consumer) {
        consumer.getStats().addHealth(4);
    }
}
