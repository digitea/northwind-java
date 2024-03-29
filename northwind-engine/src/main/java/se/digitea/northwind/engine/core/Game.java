package se.digitea.northwind.engine.core;

import org.slf4j.LoggerFactory;
import se.digitea.northwind.engine.entities.Entity;
import se.digitea.northwind.engine.exceptions.IllegalPositionException;
import se.digitea.northwind.engine.items.Weapon;
import se.digitea.northwind.engine.world.World;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private final static int GAME_SIZE = 128;
    private final Player player;
    private final World world;

    public Game() {
        Point startingPosition = new Point(ThreadLocalRandom.current().nextInt(GAME_SIZE), ThreadLocalRandom.current().nextInt(GAME_SIZE));
        world = new World(GAME_SIZE);
        player = new Player("Liezel", startingPosition);
    }

    private void moveTo(Point position) throws IllegalPositionException {
        if (position.x < 0 || position.x >= GAME_SIZE || position.y < 0 || position.y >= GAME_SIZE) {
            throw new IllegalPositionException(position);
        }

        player.setPosition(position);
    }

    public boolean move(Direction direction) {
        try {
            switch (direction) {
                case EAST:
                    moveTo(new Point(player.getPosition().x + 1, player.getPosition().y));
                case WEST:
                    moveTo(new Point(player.getPosition().x - 1, player.getPosition().y));
                case NORTH:
                    moveTo(new Point(player.getPosition().x, player.getPosition().y - 1));
                case SOUTH:
                    moveTo(new Point(player.getPosition().x, player.getPosition().y + 1));
            }

            return true;
        } catch (IllegalPositionException e) {
            LoggerFactory.getLogger(Game.class).warn("Attempted to move to an illegal position.", e);
            return false;
        }
    }

    public Player getPlayer() {
        return player;
    }

    public World getWorld() {
        return world;
    }

    public void attack(Entity target, Weapon weapon) {
        final int damage = weapon != null ? weapon.getDamage(player, target) : (int) Math.floor(player.getStats().getStrength() / 2.0);
        target.getStats().setHealth(target.getStats().getHealth() - damage);
    }
}
