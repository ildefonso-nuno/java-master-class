package ArraysListsBoxing;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int sizeArray) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[sizeArray];
        System.out.println("Enter "+sizeArray+" integer values:\r");
        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(values));
        return values;
    }

    public static void printArray(int[] inArray) {
        for(int i=0; i<inArray.length; i++) {
            System.out.println("Element "+ i +" contents "+ inArray[i]);
        }
    }

    public static int[] sortIntegers(int[] inArray) {
        int tempNumber;
        Boolean isBigger = false;

        for (int i = inArray.length-1; i > 0; i--) {
            if (inArray[i] > inArray[i - 1]) {
                tempNumber = inArray[i - 1];
                inArray[i - 1] = inArray[i];
                inArray[i] = tempNumber;
                isBigger = true;
                while (isBigger) {
                    i++;
                    if (i == inArray.length) {
                        break;
                    }
                    if (inArray[i] > inArray[i - 1]) {
                        tempNumber = inArray[i - 1];
                        inArray[i - 1] = inArray[i];
                        inArray[i] = tempNumber;
                    } else {
                        isBigger = false;
                    }
                }
            }
        }

        return inArray;
    }
}
