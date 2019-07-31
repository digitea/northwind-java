package se.digitea.adventure.engine.annotations;

import se.digitea.adventure.engine.items.Item;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Loot.LootItems.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Loot {
    Class<? extends Item> item();

    double probability();

    @Retention(RetentionPolicy.RUNTIME)
    @interface LootItems {
        Loot[] value();
    }
}
