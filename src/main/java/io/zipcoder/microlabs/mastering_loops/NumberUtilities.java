package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String expected = "";
        for (Integer i = start; i <= stop; i++) {
            if (i%2 == 0){
               expected = expected + i.toString();
            }
        }
        return expected;
    }

    public static String getOddNumbers(int start, int stop) {
        String expected = "";
        for (Integer i = start; i <= stop; i++) {
            if (i%2 == 1){
                expected = expected + i.toString();
            }
        }
        return expected;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String expected = "";
        for (Integer i = start; i < stop; i++) {
            if (i%5 == 0) {
                Integer s = i * i;
                expected = expected + s.toString();
            }
        } return expected;
    }

    public static String getRange(int start) {

        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
            String expected = "";
            for (Integer i = start; i <= stop; i++) {

        }
            return null;
    }
}
