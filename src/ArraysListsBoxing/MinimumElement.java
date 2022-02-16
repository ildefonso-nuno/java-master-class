package ArraysListsBoxing;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int numElements) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[numElements];
        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static int findMin(int[] inArray) {
        int minInt = inArray[0];
        for(int i=1; i<inArray.length; i++) {
            if(inArray[i]<minInt) minInt = inArray[i];
        }
        return minInt;
    }
}
