package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String a[]) {
        int arr[] = {1, 99, 5, 66, 81, 111, 14, 45, 67, 4, 13,45};
        int temp = 0;
        int sortedIndex = 1;
        int numberOfIterations=0;
        while(sortedIndex <= arr.length-1) {
            for (int i = sortedIndex; i > 0; i--) {
                if (arr[i] < arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                } else {
                    break;
                }
                numberOfIterations++;

            }
            sortedIndex++;
           // Arrays.stream(arr).forEach(System.out::println);
        }
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println(numberOfIterations);
    }

}
