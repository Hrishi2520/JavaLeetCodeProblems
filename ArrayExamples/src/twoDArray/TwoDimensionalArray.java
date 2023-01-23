package twoDArray;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        System.out.println(Arrays.toString(array));
        System.out.println("array.length: "+array.length);

        for (int[] outer : array) {
            System.out.println(Arrays.toString(outer));
        }

        //second way to print 2DArray
        int[][] array2 = {{25,11, 14},{20, 28, 25},{11, 25, 20}};
        showArray(array2);

        //third way to print 2DArray
        String[][] friends = {{"Hrishi", "Ketan", "bhavesh"}, {"ketan", "bhavesh", "ashish"}, {"bhavesh", "ashish", "Hrishi"}};
        System.out.println(Arrays.deepToString(friends));
    }
    private static void showArray ( int[][] array) {
        for (var outer : array) {
            for (var element : outer) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
