package se.digitea.northwind.engine.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Stats {
    int health();

    int strength();
}
