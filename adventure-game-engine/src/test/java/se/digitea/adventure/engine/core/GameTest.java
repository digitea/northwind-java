package se.digitea.adventure.engine.core;

import org.junit.jupiter.api.Test;
import se.digitea.adventure.engine.entities.Animal;
import se.digitea.adventure.engine.entities.Entity;
import se.digitea.adventure.engine.entities.Stats;
import se.digitea.adventure.engine.world.World;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

    @Test
    void move() {
    }

    @Test
    void attackWithoutWeapon() {
        Game game = new Game();
        Entity target = new Animal("Pig", "A dirty swine.", new Stats(1, 0), StandardFactions.PASSIVE_ANIMALS);

        game.attack(target, null);

        assertEquals(0, target.getStats().getHealth());
    }
}