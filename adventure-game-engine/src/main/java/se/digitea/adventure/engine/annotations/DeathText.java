package se.digitea.adventure.engine.annotations;

import se.digitea.adventure.engine.core.DeathCause;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@Repeatable(DeathText.DeathTexts.class)
public @interface DeathText {
    DeathCause cause();

    String[] value();

    @Retention(RetentionPolicy.RUNTIME)
    @interface DeathTexts {
        DeathText[] value();
    }
}
