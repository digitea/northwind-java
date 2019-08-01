package se.digitea.northwind.entities;

import se.digitea.northwind.engine.annotations.Description;
import se.digitea.northwind.engine.annotations.Name;
import se.digitea.northwind.engine.annotations.Standing;
import se.digitea.northwind.engine.annotations.Stats;
import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.entities.Standings;

@Name("Goblin")
@Description("It's green and reeks.")
@Description("It does not look friendly.")
@Stats(health = 3, strength = 1)
@Standing(Standings.HOSTILE)
public class Goblin extends Entity {
}
