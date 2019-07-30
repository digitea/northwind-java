package se.digitea.adventure.engine.templating;

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
