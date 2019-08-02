package se.digitea.northwind;

import org.slf4j.LoggerFactory;
import se.digitea.northwind.engine.core.Direction;
import se.digitea.northwind.engine.core.Game;
import se.digitea.northwind.engine.core.PrintStreamOutputter;
import se.digitea.northwind.engine.core.TextTemplate;
import se.digitea.northwind.templates.PlayerInfoTextTemplate;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        "                       ███    ███                                                                 "
    ).withPersistence(false);

    private static final TextTemplate WELCOME_TEXT = TextTemplate.of(//
        "The northern winds blow cold against a naked body.",
        "They whisper a name. ${player.name}."
    ).withPersistence(false);

    private static final TextTemplate EXIT_TEXT = TextTemplate.of(
        "The northern winds bid ${player.name} farewell."
    ).withPersistence(false);

    private static TextTemplate HELP_TEXT = TextTemplate.of(
        "The northern winds offer help to a weary soul.",
        "",
        "attack [ENTITY]",
        "    Attack a target entity.",
        "exit",
        "    Exit the game.",
        "go [DIRECTION]",
        "    Move in a direction",
        "help",
        "    Show this message.",
        "info",
        "    Print player info.",
        "loot [ENTITY]",
        "    Loot a dead entity."
    ).withPersistence(false);

    public void run() {
        running = true;
        Game game = new Game();
        final PrintStreamOutputter out = new PrintStreamOutputter(System.out);

        out.output(TITLE_TEXT);
        out.output(TextTemplate.empty());
        out.output(WELCOME_TEXT.withValues(game.getPlayer().getTextTemplateValues()));

        try (Scanner scanner = new Scanner(new InputStreamReader(System.in))) {
            while (running) {
                if (!scanner.hasNextLine()) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(10);
                        continue;
                    } catch (InterruptedException e) {
                        LoggerFactory.getLogger(NorthwindGame.class).warn("Thread sleep was interrupted.", e);
                    }
                }

                final String command = scanner.nextLine();
                final String[] args = command.split("\\s+");

                TextTemplate text = handle(args, game);
                out.output(text);
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
                return attemptMove(Arrays.copyOfRange(args, 1, args.length), game);
            case "help": // TODO Print help
                return HELP_TEXT;
            case "info": // Print player info
                return PlayerInfoTextTemplate.of(game.getPlayer());
            case "loot": // TODO Loot a dead entity
                return TextTemplate.of("TODO: loot [ENTITY]");
            default: // Unknown/unimplemented command
                return TextTemplate.of("The command cannot be carried out.");
        }
    }

    private TextTemplate attemptMove(String[] args, Game game) {
        try {
            Direction direction = Direction.valueOf(args[0].trim().toUpperCase());
            if (game.move(direction)) {
                return TextTemplate.of("${player.name} ventured ${direction}.")
                    .withValues(Map.of("direction", direction.name().toLowerCase()))
                    .withValues(game.getPlayer().getTextTemplateValues())
                    .withPersistence(false);
            } else {
                return TextTemplate.of("${player.name} could not travel to the ${direction}.")
                    .withValues(Map.of("direction", direction.name().toLowerCase()))
                    .withValues(game.getPlayer().getTextTemplateValues())
                    .withPersistence(false);
            }
        } catch (IllegalArgumentException e) {
            return TextTemplate.of(
                "The northern winds did not understand.",
                "${player.name} did not not move."
            ).withValues(game.getPlayer().getTextTemplateValues()).withPersistence(false);
        }
    }

    public static void main(String[] args) throws IOException {
        NorthwindGame game = new NorthwindGame();
        game.run();
    }
}
