package se.digitea.adventure.engine.core;

public class Faction implements Nameable {
    private final String name;
    private boolean hostile;

    public Faction(String name, boolean hostile) {
        this.name = name;
        this.hostile = hostile;
    }

    public boolean isHostile() {
        return hostile;
    }

    public void setHostility(boolean hostile) {
        this.hostile = hostile;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return name + " is " + (hostile ? "" : "not " + "hostile with you.");
    }
}
