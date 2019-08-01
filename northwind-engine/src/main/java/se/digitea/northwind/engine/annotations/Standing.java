package se.digitea.northwind.engine.annotations;

import se.digitea.northwind.engine.entities.Standings;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Standing {
    Standings value();
}
