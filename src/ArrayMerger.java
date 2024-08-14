import java.util.Arrays;

public class ArrayMerger {
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, mergedArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, mergedArray, firstArray.length, secondArray.length);


        Arrays.sort(mergedArray);

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] firstArray = {1, 3, 7, 5};
        int[] secondArray = {8, 4, 2, 4};

        int[] sortedArray = mergeAndSort(firstArray, secondArray);
        System.out.println(Arrays.toString(sortedArray));
    }
}