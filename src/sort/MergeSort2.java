package sort;

import java.util.Arrays;

public class MergeSort2 {


    public static void main(String a[]) {
        int arr[] = {1, 99, 5, 66, 81, 111, 14, 45, 67, 4, 13,45};
        int temp[] = new int[arr.length];

        int low = 0;
        int high = arr.length-1;
        mergeSort(arr, low, high, temp);
        Arrays.stream(arr).forEach(System.out::println);

    }


    private static void mergeSort(int[] arr, int low, int high, int[] temp) {
        int mid = (low + high)/2;
        if( low < high) {
            System.out.println("low:"+low+" high:"+high+ " mid:"+mid);

            mergeSort(arr, low, mid, temp);
            mergeSort(arr, mid + 1, high, temp);
            merge(arr, low, high, mid, temp);
        }
    }

    private static void merge(int[] arr, int low, int high, int mid, int[] temp) {
        System.out.println("lowerIndex:"+low+" higherIndex:"+high+ " mid:"+mid);
        int[] temps = new int[high+1];
        int i = low;
        int j = mid+1;
        int k = low;

        for( int m = i ; m <= high ; m++) {
            temps[m] = arr[m];
        }


        //Arrays.stream(temps).forEach(System.out::println);

        while (i <= mid && j <= high) {
            if(temps[i] > temps[j]) {
                arr[k] = temps[j];
                j++;
            } else if (temps[i] < temps[j]) {
                arr[k] = temps[i];
                i++;
            }
        k++;

        }

        while(i<=mid){
            arr[k] = temps[i];
            i++;
            k++;
        }

        while(j<=high){
            arr[k] = temps[j];
            j++;
            k++;
        }

    }
}
