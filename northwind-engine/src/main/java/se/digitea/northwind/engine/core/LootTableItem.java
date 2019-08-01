package se.digitea.northwind.engine.core;

import se.digitea.northwind.engine.items.Item;

public class LootTableItem implements Comparable<LootTableItem> {
    private final Item item;
    private final double chance;

    public LootTableItem(Item item, double chance) {
        this.item = item;
        this.chance = chance;
    }

    public Item getItem() {
        return item;
    }

    public double getChance() {
        return chance;
    }

    @Override
    public int compareTo(LootTableItem lootTableItem) {
        return Double.compare(getChance(), lootTableItem.getChance());
    }
}
