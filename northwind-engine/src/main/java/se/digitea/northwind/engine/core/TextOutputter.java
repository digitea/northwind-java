package se.digitea.northwind.engine.core;

import java.util.List;

public interface TextOutputter {
    List<String> getHistory();

    void output(TextTemplate text);
}
