package se.digitea.adventure.engine.core;

public class Stats {
    private int health;
    private int maxHealth;
    private int strength;

    public Stats(int health, int strength) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.min(Math.max(health, 0), maxHealth);
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = Math.max(maxHealth, 0);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = Math.max(strength, 0);
    }
}
