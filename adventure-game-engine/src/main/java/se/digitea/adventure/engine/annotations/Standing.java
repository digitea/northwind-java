package se.digitea.adventure.engine.annotations;

import se.digitea.adventure.engine.entities.Standings;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Standing {
    Standings value();
}
