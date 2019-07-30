package se.digitea.adventure.entities;

import se.digitea.adventure.engine.entities.*;

@Name("Goblin")
@Description("It's green and reeks.")
@Description("It does not look friendly.")
@Stats(health = 3, strength = 1)
@Standing(Standings.HOSTILE)
public class Goblin extends Entity {
}
