package se.digitea.adventure.engine.entities;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Standing {
    Standings value();
}
