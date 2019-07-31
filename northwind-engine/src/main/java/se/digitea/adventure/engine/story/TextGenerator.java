package se.digitea.adventure.engine.story;

import org.apache.commons.text.StringSubstitutor;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public interface TextGenerator {
    Path getTemplateFilePath();

    default Map<String, List<String>> getTemplates() throws IOException {
        Yaml yaml = new Yaml();
        Map<String, List<String>> map = yaml.load(Files.newBufferedReader(getTemplateFilePath()));
        return map;
    }

    default String getRandomTemplate(String key) throws IOException {
        List<String> templates = getTemplates().get(key);
        int index = ThreadLocalRandom.current().nextInt(templates.size());
        return templates.get(index);
    }

    default String getText(String key, Map<String, String> templateData) {
        try {
            String template = getRandomTemplate(key);
            StringSubstitutor stringSubstitutor = new StringSubstitutor(templateData);
            return stringSubstitutor.replace(template);
        } catch (IOException e) {
            LoggerFactory.getLogger(TextGenerator.class).error("Failed to load text template.", e);
            return "?";
        }
    }
}
