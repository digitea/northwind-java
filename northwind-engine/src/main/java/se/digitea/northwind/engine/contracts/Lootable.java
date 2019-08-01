package se.digitea.northwind.engine.contracts;

import se.digitea.northwind.engine.core.LootTable;
import se.digitea.northwind.engine.items.Item;

import java.util.List;

/**
 * Can be looted for items.
 */
@FunctionalInterface
public interface Lootable {
    LootTable getLootTable();

    /**
     * Loot for items.
     *
     * @return Found items.
     */
    default List<Item> loot() {
        return getLootTable().rollForLoot();
    }
}
