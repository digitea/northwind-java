package se.digitea.adventure.entities;

import se.digitea.adventure.engine.annotations.Description;
import se.digitea.adventure.engine.annotations.Name;
import se.digitea.adventure.engine.annotations.Standing;
import se.digitea.adventure.engine.annotations.Stats;
import se.digitea.adventure.engine.entities.Entity;
import se.digitea.adventure.engine.entities.Standings;

@Name("Goblin")
@Description("It's green and reeks.")
@Description("It does not look friendly.")
@Stats(health = 3, strength = 1)
@Standing(Standings.HOSTILE)
public class Goblin extends Entity {
}
