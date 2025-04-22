package io.hexlet.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArraysAsSetsTest {

    private final String[] strColl1 = {"Vasya", "Kolya", "Petya"};
    private final String[] strColl2 = {"Igor", "Petya", "Sergey", "Vasya", "Sasha"};
    private final Integer[] intColl1 = {13, 22, 14};
    private final Integer[] intColl2 = {12, 13, 45, 22, 99};


    @Test
    void intersectionTest() {
        final String[] expected = {"Vasya", "Petya"};
        assertArrayEquals(ArraysAsSets.intersection(this.strColl1, this.strColl2), expected);

        final Integer[] expected2 = {13, 22};
        assertArrayEquals(ArraysAsSets.intersection(this.intColl1, this.intColl2), expected2);
    }

    @Test
    void unionTest() {
        final String[] expected = {"Petya", "Sasha", "Igor", "Kolya", "Vasya", "Sergey"};
        assertArrayEquals(ArraysAsSets.union(this.strColl1, this.strColl2), expected);

        final Integer[] expected2 = {99, 22, 12, 13, 45, 14};
        assertArrayEquals(ArraysAsSets.union(this.intColl1, this.intColl2), expected2);
    }

    @Test
    void differenceTest() {
        final String[] expected = {"Kolya"};
        assertArrayEquals(ArraysAsSets.difference(this.strColl1, this.strColl2), expected);

        final Integer[] expected2 = {14};
        assertArrayEquals(ArraysAsSets.difference(this.intColl1, this.intColl2), expected2);
    }
}
