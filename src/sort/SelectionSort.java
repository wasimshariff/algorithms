package sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String a[]) {

        int arr[] = {1, 99, 5, 66, 81, 111, 14, 45, 67, 4, 13,45};

        int k  = arr.length-1;

        while( k >= 0) {
            int bigIndex = 0;
            for(int i=0 ;i< k-1; i++) {
                if ( arr[i] > arr[bigIndex]) {
                    bigIndex = i;
                }
            }
            if( arr[k] < arr[bigIndex]) {
                int temp = arr[k];
                arr[k] = arr[bigIndex];
                arr[bigIndex] = temp;
            }

            System.out.println("Pass Number:"+k);
         //   Arrays.stream(arr).forEach(System.out::println);
            k--;

        }

        Arrays.stream(arr).forEach(System.out::println);


    }
}



