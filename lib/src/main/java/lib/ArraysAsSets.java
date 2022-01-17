package lib;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysAsSets {

    public static <T> T[] intersection(T[] firstArray, T[] secondArray) {
        return (T[]) Arrays.stream(firstArray)
                .distinct()
                .filter(x -> Arrays.stream(secondArray).anyMatch(y -> y == x))
                .toArray();
    }

    public static <T> T[] union(T[] firstArray, T[] secondArray) {
        Set<T> set = new HashSet<>();
        set.addAll(Arrays.asList(firstArray));
        set.addAll(Arrays.asList(secondArray));
        return (T[]) set.toArray();
    }

    public static <T> T[] difference(T[] firstArray, T[] secondArray) {
        return (T[]) Arrays.stream(firstArray)
                .filter(e -> !Arrays.asList(secondArray).contains(e))
                .toArray();
    }

    public static <T> boolean includes(T[] arr, T data) {
        return Arrays.asList(arr).contains(data);
    }

    public static void main(String[] args) {
        final Integer[] firstIntArr = new Integer[]{13, 22, 14};
        final Integer[] secondIntArr = new Integer[]{12, 13, 45, 22, 99};

        System.out.println(includes(firstIntArr, 10));
    }
}
