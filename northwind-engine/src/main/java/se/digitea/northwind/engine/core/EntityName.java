package se.digitea.northwind.engine.core;

import java.util.ArrayList;
import java.util.List;

public class EntityName {
    private final String baseName;
    private List<String> prefixTitles = new ArrayList<>();
    private List<String> postfixTitles = new ArrayList<>();

    public EntityName(String baseName) {
        this.baseName = baseName;
    }

    @Override
    public String toString() {
        String prefix = String.join(", ", prefixTitles);
        String postfix = String.join(" ", postfixTitles);

        return String.join(" ", prefix, baseName, postfix).trim();
    }

    public void addPrefixTitle(String title) {
        prefixTitles.add(title);
    }

    public void addPostfixTitle(String title) {
        postfixTitles.add(title);
    }
}
