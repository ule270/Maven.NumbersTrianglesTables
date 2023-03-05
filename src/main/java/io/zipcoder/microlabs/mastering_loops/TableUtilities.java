package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
      String expected = "";
        for (Integer i = 1; i <= 5; i++) {
            for (Integer j = 1; j <= 5; j++) {
                Integer answer = j * i;
                if (answer > 9 ) {
                    String line = " " + answer.toString() + " |";
                    expected = expected + line;
                } else {
                    String line = "  " + answer.toString() + " |";
                    expected = expected + line;
                }
            } expected = expected + "\n";
        }
        return expected;
    }

    public static String getLargeMultiplicationTable() {
        String expected = "";
        for (Integer i = 1; i <= 10; i++) {
            for (Integer j = 1; j <= 10; j++) {
                Integer answer = j * i;
                if (answer > 9) {
                    String line = " " + answer.toString() + " |";
                    expected = expected + line;
                } else {
                    String line = "  " + answer.toString() + " |";
                    expected = expected + line;
                }
                if (answer > 90) {
                    String line = "" + answer.toString() + " |";
                    expected = expected + line;
                }
            } expected = expected + "\n";
        }
        return expected;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
//         if (answer > 99 ) {
//             String line = "" + answer.toString() + " |";
//             expected = expected + line;
//                } else if (answer > 9){
//             String line = " " + answer.toString() + " |";
//             expected = expected + line;
//         } else
    }
}
