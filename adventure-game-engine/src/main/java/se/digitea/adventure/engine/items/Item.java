package se.digitea.adventure.engine.items;

import se.digitea.adventure.engine.annotations.Description;
import se.digitea.adventure.engine.annotations.Name;
import se.digitea.adventure.engine.core.EntityName;
import se.digitea.adventure.engine.core.Effect;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Item {
    private final EntityName name;
    private final String description;
    private List<Effect> effects = new ArrayList<>();

    public Item() {
        this.name = new EntityName(getClass().getAnnotation(Name.class).value());

        Description[] descriptionAnnotations = getClass().getAnnotationsByType(Description.class);
        this.description = descriptionAnnotations[ThreadLocalRandom.current().nextInt(descriptionAnnotations.length)].value();
    }

    public List<Effect> getEffects() {
        return List.copyOf(effects);
    }

    public void addEffect(Effect effect) {
        effects.add(effect);
    }

    public String getName() {
        return name.toString();
    }

    public String getDescription() {
        return description;
    }
}
