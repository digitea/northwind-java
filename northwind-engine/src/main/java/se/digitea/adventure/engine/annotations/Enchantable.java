package se.digitea.adventure.engine.annotations;

import se.digitea.adventure.engine.contracts.Enchantment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Enchantable {
    Class<? extends Enchantment>[] value();
}
