package ArraysListsBoxing;

public class Main {

    public static void main(String[] args) {

        int[] sortedArray = SortedArray.getIntegers(5);

        SortedArray.printArray(SortedArray.sortIntegers(sortedArray));
    }
}