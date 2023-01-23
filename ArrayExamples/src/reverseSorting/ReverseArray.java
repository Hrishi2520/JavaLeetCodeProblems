package reverseSorting;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {
        int[] unsorted = getRandomArray(5);
        System.out.println("Random array: \n"+Arrays.toString(unsorted));

        int[] sortedArray = getSortedArray(unsorted);
        System.out.println("sorted array: \n"+Arrays.toString(sortedArray));
    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int[] getSortedArray(int[] array) {
        System.out.println("before sort: \n"+Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length -1; i++) {
                if (sortedArray[i] > sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
//                    System.out.println(Arrays.toString(sortedArray));
                }
            }
//            System.out.println(Arrays.toString(sortedArray)+"\n");
        }
        return sortedArray;
    }
}
