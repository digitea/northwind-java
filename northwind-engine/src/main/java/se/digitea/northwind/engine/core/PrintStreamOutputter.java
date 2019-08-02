package se.digitea.northwind.engine.core;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class PrintStreamOutputter implements TextOutputter {
    private final List<String> history = new ArrayList<>();
    private final PrintStream stream;

    public PrintStreamOutputter(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public List<String> getHistory() {
        return List.copyOf(history);
    }

    @Override
    public void output(TextTemplate text) {
        String string = text.toString();

        if (text.isPersistent()) {
            history.add(string);
        }

        stream.println(string);
    }

}
