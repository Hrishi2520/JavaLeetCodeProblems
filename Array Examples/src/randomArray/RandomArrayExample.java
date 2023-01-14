package randomArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to print the random array: ");
        // creating random array example with the help of scanner input.
        int[] randomArray = RandomArrayExample.getRandomArray(scanner.nextInt());
        // printing random array.
        System.out.println("-".repeat(30));
        System.out.println(Arrays.toString(randomArray));
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
