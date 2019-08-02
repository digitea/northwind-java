package se.digitea.northwind.engine.core;

import org.apache.commons.text.StringSubstitutor;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextTemplate {
    private final static TextTemplate EMPTY_TEXT_TEMPLATE = TextTemplate.of("");
    private final Decorator decorator;
    private final String template;
    private final Map<String, String> values;
    private final boolean persistence;

    private TextTemplate(String template, Map<String, String> values, boolean persistence, Decorator decorator) {
        this.template = template;
        this.values = values;
        this.persistence = persistence;
        this.decorator = decorator;
    }

    public static TextTemplate of(String template, Map<String, String> values) {
        return new TextTemplate(template, Map.copyOf(values), true, StandardDecorators.NONE);
    }

    public static TextTemplate of(String template) {
        return new TextTemplate(template, Collections.emptyMap(), true, StandardDecorators.NONE);
    }

    public static TextTemplate of(String... templateLines) {
        return of(String.join(System.lineSeparator(), templateLines));
    }

    public static TextTemplate empty() {
        return EMPTY_TEXT_TEMPLATE;
    }

    public TextTemplate withValues(Map<String, String> values) {
        Map<String, String> allValues = Stream.concat(this.values.entrySet().stream(), values.entrySet().stream())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return new TextTemplate(template, allValues, persistence, decorator);
    }

    public TextTemplate withPersistence(boolean persistence) {
        return new TextTemplate(template, values, persistence, decorator);
    }

    public TextTemplate withDecorator(Decorator decorator) {
        return new TextTemplate(template, values, persistence, decorator);
    }

    public boolean isPersistent() {
        return persistence;
    }

    @Override
    public String toString() {
        StringSubstitutor substitutor = new StringSubstitutor(values);
        String substituted = substitutor.replace(template);
        return decorator.decorate(substituted);
    }
}
