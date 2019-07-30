package se.digitea.adventure.entities;

import se.digitea.adventure.engine.entities.*;

@Name("Pig")
@Description("It is dirty and it stinks.")
@Stats(health = 3, strength = 1)
@Standing(Standings.NEUTRAL)
// TODO @Loot(item = Fat.class, probability = 0.5)
// TODO @Loot(item = RawPork.class, probability = 1)
public class Pig extends Entity {
}
