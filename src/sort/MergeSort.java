package sort;


import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSort {

    public static void main(String a[]) {
        int arr[] = {1, 99, 5, 66, 81, 111, 14, 45, 67, 4, 13,45,5};
        //int arr[] = {10, 2, 3, 4};
        int temp[] = new int[arr.length];
        merge(arr, 0, arr.length - 1, temp);
        Arrays.stream(arr).forEach(System.out::println);

    }

    private static void merge(int[] arr, int low, int high, int[] temp) {
        //System.out.println("low:"+low+ " high:"+high);
        int mid = (low + high) / 2;
      //  IntStream.rangeClosed(low, high).forEach(index -> System.out.println(arr[index]));
        System.out.println("****************************");
        if (low < high) {
            merge(arr, low, mid, temp);
            merge(arr, mid + 1, high, temp);
            mergeParts(arr, low, mid, high, temp);
        }

    }

    private static void mergeParts(int[] arr, int lowerIndex, int middle, int higherIndex, int[] temp) {
        System.out.println("lowerIndex:"+lowerIndex+" higherIndex:"+higherIndex+ " mid:"+middle);
        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;
        for( int m = lowerIndex ; m <=higherIndex; m++) {
            temp[m] = arr[m];
        }

        while( i <= middle && j <= higherIndex) {
            if ( temp[i] > temp[j]) {
                arr[k] = temp[j];
                j++;
            } else if ( temp[i] < temp[j]) {
                arr[k] = temp[i];
                i++;
            } else { // if both elements are same
                arr[k] = temp[j];
                j++;
                k++;
                arr[k] = temp[i];
                i++;
            }
            k++;
        }

        while(i <= middle) {
            arr[k] = temp[i];
            k++;
            i++;
        }

        while(j <= higherIndex) {
            arr[k] = temp[j];
            k++;
            j++;

        }
    }


}
