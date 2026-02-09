import java.util.ArrayList;
import java.util.Arrays;
// some of these test cases are wrtten by AI

public class StandardAlgorithmTest {
    public static void testFindMin() {
        assertEqualsInt("findMin basic", 2, StandardAlgorithms.findMin(ints(5, 2, 9, 2, 7)));
        assertEqualsInt("findMin with negatives", -10, StandardAlgorithms.findMin(ints(3, -1, 0, -10, 8)));
    }

    public static void testFindAvg() {
        assertEqualsDouble("findAvg basic", 5.0, StandardAlgorithms.findAvg(ints(2, 4, 6, 8)), 1e-9);
        assertEqualsDouble("findAvg non-integer", 1.5, StandardAlgorithms.findAvg(ints(1, 2)), 1e-9);
    }

    public static void testFindMode() {
        assertEqualsInt("findMode basic", 2, StandardAlgorithms.findMode(ints(1, 2, 2, 3, 2, 4)));
        int ans = StandardAlgorithms.findMode(ints(7, 9, 7, 9, 1)); // tie: 7 or 9 ok
        assertTrue("findMode tie allowed", ans == 7 || ans == 9);
    }

    public static void testSearchOne() {
        assertEqualsInt("searchOne first even", 2, StandardAlgorithms.searchOne(ints(3, 7, 8, 10)));
        assertEqualsInt("searchOne no even", -1, StandardAlgorithms.searchOne(ints(3, 7, 9, 11)));
    }

    public static void testAllNegative() {
        assertEqualsBool("allNegative true", true, StandardAlgorithms.allNegative(ints(-1, -5, -3)));
        assertEqualsBool("allNegative false with zero", false, StandardAlgorithms.allNegative(ints(-1, 0, -3)));
    }

    public static void testCountConsecutivePairs() {
        assertEqualsInt("countConsecutivePairs example", 3,
                StandardAlgorithms.countConsecutivePairs(ints(2, 3, 3, 1, 1, 3, 2, 2)));
        assertEqualsInt("countConsecutivePairs none", 0, StandardAlgorithms.countConsecutivePairs(ints(1, 2, 3, 4, 5)));
    }

    public static void testHasDuplicates() {
        assertEqualsBool("hasDuplicates true", true, StandardAlgorithms.hasDuplicates(ints(1, 2, 3, 1)));
        assertEqualsBool("hasDuplicates false", false, StandardAlgorithms.hasDuplicates(ints(1, 2, 3, 4)));
    }

    public static void testFirstLetterA() {
        // Note: This expects your method counts lowercase 'a' only.
        assertEqualsInt("firstLetterA basic", 2, StandardAlgorithms.firstLetterA(strs("app", "banana", "audio", "bear")));

        // If you want to avoid empty-string edge cases, do not include "" in student tests.
        // If you DO want them to handle empty strings safely, keep this test and update the method accordingly.
        assertEqualsInt("firstLetterA simple", 2, StandardAlgorithms.firstLetterA(strs("a", "b", "apple", "cat")));
    }

    public static void testShiftLeft() {
        ArrayList<Integer> arr = ints(1, 2, 3, 4, 5);
        StandardAlgorithms.shiftLeft(arr);
        assertArrayListEquals("shiftLeft basic", ints(2, 3, 4, 5, 1), arr);

        ArrayList<Integer> one = ints(42);
        StandardAlgorithms.shiftLeft(one);
        assertArrayListEquals("shiftLeft size 1", ints(42), one);
    }

    public static void testShiftRight() {
        ArrayList<Integer> arr = ints(1, 2, 3, 4, 5);
        StandardAlgorithms.shiftRight(arr);
        assertArrayListEquals("shiftRight basic", ints(5, 1, 2, 3, 4), arr);

        ArrayList<Integer> one = ints(42);
        StandardAlgorithms.shiftRight(one);
        assertArrayListEquals("shiftRight size 1", ints(42), one);
    }

    public static void testReverse() {
        ArrayList<String> arr = strs("a", "b", "c", "d");
        StandardAlgorithms.reverse(arr);
        assertArrayListEquals("reverse basic", strs("d", "c", "b", "a"), arr);

        ArrayList<String> odd = strs("x", "y", "z");
        StandardAlgorithms.reverse(odd);
        assertArrayListEquals("reverse odd length", strs("z", "y", "x"), odd);
    }

    // -------------------------
    // Helpers: builders
    // -------------------------

    private static ArrayList<Integer> ints(Integer... values) {
        return new ArrayList<>(Arrays.asList(values));
    }

    private static ArrayList<String> strs(String... values) {
        return new ArrayList<>(Arrays.asList(values));
    }

    // -------------------------
    // Helpers: assertions
    // -------------------------

    private static void assertEqualsInt(String name, int expected, int actual) {
        if (expected != actual) {
            System.out.println("FAIL: " + name + " | expected: " + expected + " | actual: " + actual);
        } else {
            System.out.println("PASS: " + name);
        }
    }

    private static void assertEqualsDouble(String name, double expected, double actual, double eps) {
        if (Math.abs(expected - actual) > eps) {
            System.out.println("FAIL: " + name + " | expected: " + expected + " | actual: " + actual);
        } else {
            System.out.println("PASS: " + name);
        }
    }

    private static void assertEqualsBool(String name, boolean expected, boolean actual) {
        if (expected != actual) {
            System.out.println("FAIL: " + name + " | expected: " + expected + " | actual: " + actual);
        } else {
            System.out.println("PASS: " + name);
        }
    }

    private static void assertTrue(String name, boolean condition) {
        if (!condition) {
            System.out.println("FAIL: " + name);
        } else {
            System.out.println("PASS: " + name);
        }
    }

    private static void assertArrayListEquals(String name, ArrayList<?> expected, ArrayList<?> actual) {
        if (!expected.equals(actual)) {
            System.out.println("FAIL: " + name + " | expected: " + expected + " | actual: " + actual);
        } else {
            System.out.println("PASS: " + name);
        }
    }
}