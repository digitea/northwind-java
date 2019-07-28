package se.digitea.adventure.engine.exceptions;

import java.awt.*;

public class IllegalPositionException extends Throwable {
    public IllegalPositionException(Point position) {
        super("Position " + position + " is not valid.");
    }
}
