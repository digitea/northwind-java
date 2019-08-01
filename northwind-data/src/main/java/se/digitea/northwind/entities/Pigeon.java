package se.digitea.northwind.entities;

import se.digitea.northwind.engine.annotations.Description;
import se.digitea.northwind.engine.annotations.Name;
import se.digitea.northwind.engine.annotations.Standing;
import se.digitea.northwind.engine.annotations.Stats;
import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.entities.Standings;

@Name("Pigeon")
@Description("It flaps around aimlessly.")
@Stats(health = 1, strength = 1)
@Standing(Standings.NEUTRAL)
// TODO @Loot(item = Feathers.class, probability = 0.80)
// TODO @Loot(item = Feathers.class, probability = 0.60)
// TODO @Loot(item = Feathers.class, probability = 0.40)
// TODO @Loot(item = Feathers.class, probability = 0.20)
public class Pigeon extends Entity {
}
