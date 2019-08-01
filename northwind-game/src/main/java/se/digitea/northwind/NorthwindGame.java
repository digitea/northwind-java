package se.digitea.northwind;

import se.digitea.northwind.engine.core.Game;
import se.digitea.northwind.engine.core.TextTemplate;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class NorthwindGame implements Runnable {
    private volatile boolean running = false;

    private static final TextTemplate TITLE_TEXT = TextTemplate.of(//
            "███▄▄▄▄    ▄██████▄     ▄████████     ███        ▄█    █▄     ▄█     █▄   ▄█  ███▄▄▄▄   ████████▄ ",
            "███▀▀▀██▄ ███    ███   ███    ███ ▀█████████▄   ███    ███   ███     ███ ███  ███▀▀▀██▄ ███   ▀███",
            "███   ███ ███    ███   ███    ███    ▀███▀▀██   ███    ███   ███     ███ ███▌ ███   ███ ███    ███",
            "███   ███ ███    ███  ▄███▄▄▄▄██▀     ███   ▀  ▄███▄▄▄▄███▄▄ ███     ███ ███▌ ███   ███ ███    ███",
            "███   ███ ███    ███ ▀▀███▀▀▀▀▀       ███     ▀▀███▀▀▀▀███▀  ███     ███ ███▌ ███   ███ ███    ███",
            "███   ███ ███    ███ ▀███████████     ███       ███    ███   ███     ███ ███  ███   ███ ███    ███",
            "███   ███ ███    ███   ███    ███     ███       ███    ███   ███ ▄█▄ ███ ███  ███   ███ ███   ▄███",
            " ▀█   █▀   ▀██████▀    ███    ███    ▄████▀     ███    █▀     ▀███▀███▀  █▀    ▀█   █▀  ████████▀ ",
            "                       ███    ███                                                                 ");

    private static final TextTemplate WELCOME_TEXT = TextTemplate.of(//
            "The northern winds blow cold against a naked body.",
            "They whisper a name. ${player.name}."
    );

    private static final TextTemplate EXIT_TEXT = TextTemplate.of("The northern winds bid ${player.name} farewell.");

    public void run() {
        running = true;
        Game game = new Game();

        System.out.println(TITLE_TEXT);
        System.out.println();
        System.out.println(WELCOME_TEXT.withValues(Map.of("player.name", game.getPlayer().getName())));

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

                TextTemplate text = handle(args, game);
                System.out.println(text);
            }
        }
    }

    private TextTemplate handle(String[] args, final Game game) {
        if (args[0].isBlank()) {
            return TextTemplate.of("No input given. The story cannot live without you.");
        }

        switch (args[0].toLowerCase()) {
            case "attack": // TODO Attack an entity/start combat
                return TextTemplate.of("TODO: attack [ENTITY]");
            case "equip": // TODO Equip an item/put it in a slot
                return TextTemplate.of("TODO: equip [ITEM]");
            case "exit": // Exit the game
                running = false;
                return EXIT_TEXT.withValues(Map.of("player.name", game.getPlayer().getName()));
            case "go": // TODO Move the player in a direction
                return TextTemplate.of("TODO: go [DIRECTION]");
            case "help": // TODO Print help
                return TextTemplate.of("TODO: Print help.");
            case "info": // TODO Print player info
                return TextTemplate.of("TODO: info");
            case "loot": // TODO Loot a dead entity
                return TextTemplate.of("TODO: loot [ENTITY]");
            default: // Unknown/unimplemented command
                return TextTemplate.of("The command cannot be carried out.");
        }
    }

    public static void main(String[] args) throws IOException {
        NorthwindGame game = new NorthwindGame();
        game.run();
    }
}
