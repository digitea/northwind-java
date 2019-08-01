package se.digitea.northwind.engine.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Description.Descriptions.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Description {
    String value();

    @Retention(RetentionPolicy.RUNTIME)
    @interface Descriptions {
        Description[] value();
    }
}
