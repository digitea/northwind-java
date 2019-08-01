package se.digitea.northwind.engine.annotations;

import se.digitea.northwind.engine.contracts.Enchantment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Enchantable {
    Class<? extends Enchantment>[] value();
}
