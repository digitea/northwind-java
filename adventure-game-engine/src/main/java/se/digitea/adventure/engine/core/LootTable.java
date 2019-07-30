package se.digitea.adventure.engine.core;

import se.digitea.adventure.engine.items.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class LootTable {
    private final List<LootTableItem> items;

    public LootTable(List<LootTableItem> items) {
        this.items = List.copyOf(items);
        this.items.sort((a, b) -> a.compareTo(b));
    }

    public List<Item> rollForLoot() {
        List<Item> loot = new ArrayList<>();

        // Roll for each lootable item
        for (LootTableItem item : items) {
            double roll = ThreadLocalRandom.current().nextDouble();

            if (roll < item.getChance()) {
                loot.add(item.getItem());
                items.remove(item); // Prevent double looting.
            }
        }

        return loot;
    }
}
