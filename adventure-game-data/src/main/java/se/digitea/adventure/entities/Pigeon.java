package se.digitea.adventure.entities;

import se.digitea.adventure.engine.annotations.Description;
import se.digitea.adventure.engine.annotations.Name;
import se.digitea.adventure.engine.annotations.Standing;
import se.digitea.adventure.engine.annotations.Stats;
import se.digitea.adventure.engine.entities.*;

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
