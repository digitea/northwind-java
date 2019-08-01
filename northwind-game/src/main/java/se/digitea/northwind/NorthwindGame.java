package se.digitea.northwind;

import se.digitea.northwind.engine.core.TextTemplate;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class NorthwindGame implements Runnable {
    private volatile boolean running = false;

    public void run() {
        running = true;

        try (Scanner scanner = new Scanner(new InputStreamReader(System.in))) {
            while (running) {
                if (!scanner.hasNextLine()) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(10);
                        continue;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                final String command = scanner.nextLine();
                final String[] args = command.split("\\s+");

                TextTemplate text = handle(args);
                System.out.println(text);
            }
        }
    }

    private TextTemplate handle(String[] args) {
        if (args[0].isBlank()) {
            return TextTemplate.of("No input given. The story cannot live without you.");
        }

        switch (args[0].toLowerCase()) {
            case "exit":
                running = false;
                return TextTemplate.of("The northern winds bid you farewell.");
            case "help":
                return TextTemplate.of("TODO: Print help."); // TODO: Print help
            default:
                return TextTemplate.of("The command cannot be carried out.");
        }
    }

    public static void main(String[] args) throws IOException {
        NorthwindGame game = new NorthwindGame();
        game.run();
    }
}
