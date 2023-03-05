package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String expected = "";
        for (Integer i = 1; i < numberOfRows; i++) {
            for (Integer j = 1; j <= i; j++) {
                expected = expected + "*";
            }
            expected = expected + "\n";
        }
        return expected;
    }

    // expected = expected + getRow(i) + "\n"
    // also works instead of writing nested for loop

    public static String getRow(int width) {
        String expected = "";
        for (Integer i = 1; i <= width; i++) {
            expected = expected + "*";
        }
        return expected;
    }

    public static String getSmallTriangle() {
        String expected = getTriangle(5);
        return expected;
    }

    public static String getLargeTriangle() {
        String expected = getTriangle(10);
        return expected;
    }
}
