package io.hexlet.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysAsSets {

    @SuppressWarnings("unchecked")
    public static <T> T[] intersection(final T[] coll1, final T[] coll2) {
        final var result = Arrays.stream(coll1)
            .distinct()
            .filter(Arrays.asList(coll2)::contains);

        return (T[]) result.toArray();
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] union(final T[] coll1, final T[] coll2) {
        final Set<T> result = new HashSet<>();
        result.addAll(Arrays.asList(coll1));
        result.addAll(Arrays.asList(coll2));
        return (T[]) result.toArray();
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] difference(final T[] coll1, final T[] coll2) {
        var coll2AsList = Arrays.asList(coll2);
        final var result = Arrays.stream(coll1)
            .filter(e -> !coll2AsList.contains(e));

        return (T[]) result.toArray();
    }
}
