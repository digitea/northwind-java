package se.digitea.northwind.engine.core;

import org.apache.commons.text.StringSubstitutor;

import java.util.Collections;
import java.util.Map;

public class TextTemplate {
    private final String template;
    private final Map<String, String> values;

    private TextTemplate(String template, Map<String, String> values) {
        this.template = template;
        this.values = values;
    }

    public static TextTemplate of(String template, Map<String, String> values) {
        return new TextTemplate(template, Map.copyOf(values));
    }

    public static TextTemplate of(String template) {
        return new TextTemplate(template, Collections.emptyMap());
    }

    public TextTemplate withValues(Map<String, String> values) {
        return of(template, values);
    }

    @Override
    public String toString() {
        StringSubstitutor substitutor = new StringSubstitutor(values);
        return substitutor.replace(template);
    }
}
