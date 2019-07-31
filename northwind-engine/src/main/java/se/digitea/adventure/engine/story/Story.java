package se.digitea.adventure.engine.story;

import java.util.ArrayList;
import java.util.List;

/**
 * A story of a player's complete adventure.
 */
public class Story {
    /**
     * A list of text that is continuously expanded.
     */
    private final List<String> story = new ArrayList<>();

    /**
     * Push text to the story.
     *
     * @param text Text to add to the story.
     */
    public void push(String text) {
        story.add(text);
    }

    /**
     * Get the complete story.
     *
     * @return Complete player story.
     */
    public List<String> getText() {
        return List.copyOf(story);
    }
}
