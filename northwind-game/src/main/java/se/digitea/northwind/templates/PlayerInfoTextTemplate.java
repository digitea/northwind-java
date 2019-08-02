package se.digitea.northwind.templates;

import se.digitea.northwind.engine.core.Player;
import se.digitea.northwind.engine.core.StandardDecorators;
import se.digitea.northwind.engine.core.TextTemplate;

import java.util.Map;

public class PlayerInfoTextTemplate {
    private PlayerInfoTextTemplate() {
    }

    public static TextTemplate of(Player player) {
        Map<String, String> values = Map.of(
            "player.name", player.getName(),
            "player.stats.health", Integer.toString(player.getStats().getHealth()),
            "player.stats.maxHealth", Integer.toString(player.getStats().getMaxHealth()),
            "player.stats.strength", Integer.toString(player.getStats().getStrength())
        );

        return TextTemplate.of(//
            "${player.name} is known by the northern winds.",
            "",
            "Health:   ${player.stats.health}/${player.stats.maxHealth}",
            "Strength: ${player.stats.strength}"
        ).withValues(values).withPersistence(false).withDecorator(StandardDecorators.BORDER);
    }
}
