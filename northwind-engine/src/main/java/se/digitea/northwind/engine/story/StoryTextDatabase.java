package se.digitea.northwind.engine.story;

import org.apache.commons.text.StringSubstitutor;
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

    public String get(String key) {
        Map<String, String> valuesMap = new HashMap<String, String>();
        valuesMap.put("animal", "quick brown fox");
        valuesMap.put("target", "lazy dog");
        String templateString = "The ${animal} jumped over the ${target}.";
        StringSubstitutor substitutor = new StringSubstitutor(valuesMap);
        return substitutor.replace(templateString);
    }
}
