package se.digitea.adventure.engine.story;

import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class StoryTextDatabase {
    private final Map<String, String> database = new HashMap<>();

    public StoryTextDatabase() {
        try {
            loadDatabaseItems(getClass().getResource("/story/"));
        } catch (URISyntaxException | IOException e) {
            LoggerFactory.getLogger(StoryTextDatabase.class).error("Failed to load story text database.", e);
        }
    }

    private void loadDatabaseItems(URL resourceDirectory) throws URISyntaxException, IOException {
        Path path = Paths.get(resourceDirectory.toURI());
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("**\\*.yml");
        Files.find(path, 3, (file, basicFileAttributes) -> matcher.matches(file))
            .forEach(file -> {
                String key = "";
                String value = "";
                database.put(key, value);
            });
    }
}
