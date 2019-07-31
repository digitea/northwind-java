package se.digitea.adventure.engine.items;

import se.digitea.adventure.engine.annotations.Description;
import se.digitea.adventure.engine.annotations.Name;
import se.digitea.adventure.engine.contracts.Enchantment;
import se.digitea.adventure.engine.core.EntityName;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Item {
    private final EntityName name;
    private final String description;
    private List<Enchantment> enchantments = new ArrayList<>();

    public Item() {
        this.name = new EntityName(getClass().getAnnotation(Name.class).value());

        Description[] descriptionAnnotations = getClass().getAnnotationsByType(Description.class);
        this.description = descriptionAnnotations[ThreadLocalRandom.current().nextInt(descriptionAnnotations.length)].value();
    }

    public List<Enchantment> getEnchantments() {
        return List.copyOf(enchantments);
    }

    public void addEnchantment(Enchantment enchantment) {
        enchantments.add(enchantment);
    }

    public String getName() {
        return name.toString();
    }

    public String getDescription() {
        return description;
    }
}
