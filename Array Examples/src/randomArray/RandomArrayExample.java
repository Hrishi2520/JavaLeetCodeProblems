package randomArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArrayExample {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        // printing random array.
        System.out.println(Arrays.toString(firstArray)+"\n");
        // printing random array in sorted way.
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        //filling given value in second array.
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray =Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallArray));
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
