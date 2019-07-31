package se.digitea.adventure.engine.world;

public class World {
    private final Tile[][] tiles;

    public World(int size) {
        tiles = new Tile[size][size];

        for (int x = 0; x < tiles.length; x++) {
            for (int y = 0; y < tiles[x].length; y++) {
                tiles[x][y] = new EmptyTile("Empty Tile", "Located at (" + x + ", " + y + ").");
            }
        }
    }

    public Tile getTile(int x, int y) {
        return tiles[x][y];
    }
}
