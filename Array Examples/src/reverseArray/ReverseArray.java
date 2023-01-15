package reverseArray;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        int[] reverse = getReverseArray(array);
        System.out.println("printing reverse array: \n"+ Arrays.toString(reverse));
    }

    private static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");
        String input = sc.nextLine();
        String[] sArray = input.split(",");
        int[] array = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        return array;
    }
    private static int[] getReverseArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - i -1];
        }
        return result;
    }
}
