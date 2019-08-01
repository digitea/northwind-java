package se.digitea.northwind.engine.core;

import se.digitea.northwind.engine.items.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class LootTable {
    private final List<LootTableItem> items;

    public LootTable(List<LootTableItem> items) {
        this.items = List.copyOf(items);
    }

    public List<Item> rollForLoot() {
        List<Item> loot = new ArrayList<>();

        // Roll for each lootable item
        for (LootTableItem item : items) {
            double roll = ThreadLocalRandom.current().nextDouble();

            if (roll < item.getChance()) {
                loot.add(item.getItem());
            }
        }

        return loot;
    }
}
