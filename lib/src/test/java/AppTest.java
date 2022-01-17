import org.junit.jupiter.api.Test;

import static lib.ArraysAsSets.difference;
import static lib.ArraysAsSets.union;
import static lib.ArraysAsSets.intersection;
import static lib.ArraysAsSets.includes;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AppTest {
    private final String[] firstStringArr = new String[]{"Vasya", "Kolya", "Petya"};
    private final String[] secondStringArr = new String[]{"Igor", "Petya", "Sergey", "Vasya", "Sasha"};
    private final Integer[] firstIntArr = new Integer[]{13, 22, 14};
    private final Integer[] secondIntArr = new Integer[]{12, 13, 45, 22, 99};


    @Test
    void intersectionStringTest() {
        final String[] intersectResult = new String[]{"Vasya", "Petya"};
        assertArrayEquals(intersection(firstStringArr, secondStringArr), intersectResult);
    }

    @Test
    void unionStringTest() {
        final String[] unionResult = new String[]{"Petya", "Sasha", "Igor", "Kolya", "Vasya", "Sergey"};
        assertArrayEquals(union(firstStringArr, secondStringArr), unionResult);
    }

    @Test
    void differenceStringTest() {
        final String[] diffResult = new String[]{"Kolya"};
        assertArrayEquals(difference(firstStringArr, secondStringArr), diffResult);
    }

    @Test
    void includesStringTrueTest() {
        assertTrue(includes(firstStringArr, "Kolya"));
    }

    @Test
    void includesStringFalseTest() {
        assertFalse(includes(firstStringArr, "Sasha"));
    }

    @Test
    void intersectionIntTest() {
        final Integer[] intersectionResult = new Integer[]{13, 22};
        assertArrayEquals(intersection(firstIntArr, secondIntArr), intersectionResult);
    }

    @Test
    void unionIntTest() {
        final Integer[] unionResult = new Integer[]{99, 22, 12, 13, 45, 14};
        assertArrayEquals(union(firstIntArr, secondIntArr), unionResult);
    }

    @Test
    void differenceIntTest() {
        final Integer[] diffResult = new Integer[]{14};
        assertArrayEquals(difference(firstIntArr, secondIntArr), diffResult);
    }

    @Test
    void includesIntTest() {
        assertTrue(includes(firstIntArr, 13));
    }

    @Test
    void includesIntFalseTest() {
        assertFalse(includes(firstIntArr, 25));
    }
}
