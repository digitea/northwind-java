package se.digitea.northwind.engine.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EntityNameTest {

    @Test
    void toStringWithOnlyBaseName() {
        EntityName name = new EntityName("Peter");
        assertEquals("Peter", name.toString());
    }

    @Test
    void toStringWithBaseNameAndPrefixTitles() {
        EntityName name = new EntityName("Peter");

        name.addPrefixTitle("The Amazing");
        assertEquals("The Amazing Peter", name.toString());

        name.addPrefixTitle("King");
        assertEquals("The Amazing, King Peter", name.toString());
    }

    @Test
    void toStringWithBaseNameAndPostfixTitles() {
        EntityName name = new EntityName("Peter");

        name.addPostfixTitle("The Great");
        assertEquals("Peter The Great", name.toString());

        name.addPostfixTitle("King");
        assertEquals("Peter The Great King", name.toString());
    }

    @Test
    void toStringWithBaseNameAndSurroundingTitles() {
        EntityName name = new EntityName("Peter");

        name.addPrefixTitle("King");
        name.addPostfixTitle("The Great");
        assertEquals("King Peter The Great", name.toString());
    }
}