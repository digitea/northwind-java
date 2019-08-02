package se.digitea.northwind.engine.core;

public final class StandardDecorators {
    private static final int WIDTH = 80;

    public static final Decorator BORDER = string -> {
        String[] lines = string.toString().split("\n");
        StringBuilder builder = new StringBuilder((lines.length + 2) * (WIDTH + 1));

        builder.append(repeat('#', WIDTH) + System.lineSeparator());
        for (String line : lines) {
            builder.append(String.format("# %-" + (WIDTH - 4) + "s #", line) + System.lineSeparator());
        }
        builder.append(repeat('#', WIDTH) + System.lineSeparator());

        return builder.toString();
    };

    public static final Decorator NONE = string -> string;

    private static String repeat(char character, int count) {
        StringBuilder builder = new StringBuilder(count);

        while (count-- > 0) {
            builder.append(character);
        }

        return builder.toString();
    }
}
