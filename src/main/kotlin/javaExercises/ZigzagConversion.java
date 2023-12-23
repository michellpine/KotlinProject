package javaExercises;

class ZigzagConversion {

    public static String convert(String input, int numRows) {
        int counRows = 0;
        int countColums = 0;
        int numColumns = (numRows*numRows);
        int countLength = input.length();
    }


    public static void main(String args[]) {
        String input = "PAYPALISHIRING";
        int numRows = 4;
        convert(input, numRows);
    }
}
