package sort;

import java.util.Arrays;

public class MergeSortSimpler {

    static int[] arr = {38, 27, 43, 3, 9, 82, 10, 3, 4, 99, 100, 6};

    public static void main(String a[]) {
        int[] result = mergeSort(arr);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int left[] = new int[mid];
        int right[] = new int[arr.length % 2 == 0 ? mid : mid + 1];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[mid + j];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    public static int[] merge(int left[], int right[]) {
        System.out.println("left length : " + left.length + " right legth : " + right.length);
        int arr[] = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length || j < right.length) {
            if (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k] = left[i];
                    i++;
                    k++;
                } else {
                    arr[k] = right[j];
                    j++;
                    k++;
                }
            } else if (i < left.length) {
                arr[k] = left[i];
                i++;
                k++;
            } else if (j < right.length) {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        return arr;
    }

}
