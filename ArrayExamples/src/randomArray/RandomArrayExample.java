package randomArray;

import java.util.Arrays;
import java.util.Random;
//import java.util.Scanner;
public class RandomArrayExample {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        // printing random array.
        System.out.println("Printing First array: ");
        System.out.println(Arrays.toString(firstArray)+"\n");
        // printing random array in sorted way.
        Arrays.sort(firstArray);
        System.out.println("Printing First array after sorting: ");
        System.out.println(Arrays.toString(firstArray));
        System.out.println("-".repeat(20)+">");

        int[] secondArray = new int[10];
        System.out.println("printing second array: \n"+Arrays.toString(secondArray));
        //filling given value in second array.
        Arrays.fill(secondArray, 5);
        System.out.println("using fill method on secondArray: \n"+Arrays.toString(secondArray));
        System.out.println("-".repeat(20)+">");

        int[] thirdArray = getRandomArray(10);
        System.out.println("Printing third array: ");
        System.out.println(Arrays.toString(thirdArray));
        System.out.println("-".repeat(20)+">");

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println("Printing fourth array after copying third array elements: \n"+Arrays.toString(fourthArray));
        System.out.println("-".repeat(20)+">");

        Arrays.sort(fourthArray);

        System.out.println("printing third array: \n"+Arrays.toString(thirdArray));
        System.out.println("printing fourth array after sorting: \n"+Arrays.toString(fourthArray));
        System.out.println("-".repeat(20)+">");

        int[] smallArray =Arrays.copyOf(thirdArray, 5);
        System.out.println("printing smallArray after copying third element: \n"+Arrays.toString(smallArray));
        System.out.println("-".repeat(20)+">");

        String[] sArray = {"Hrishi", "Ketan", "Bhavesh", "Ashish"};
        Arrays.sort(sArray);
        System.out.println("printing String array after sorting: \n"+Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Ashish") >= 0) {
            System.out.println("Found Ashish in the List");
        }
        System.out.println("-".repeat(20)+">");

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
        System.out.println("-".repeat(20)+">");
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
