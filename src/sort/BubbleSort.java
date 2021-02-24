package sort;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String a[]) {

        int arr[] = {1, 99, 5, 66, 81, 111, 14, 45, 67, 4, 13,45};
        //int arr[] = {1, 2,3,4,5};
        int k = arr.length-1;
        int temp;
        int swaps = 0;
        boolean sorted = true;
        while ( k >= 0) {
            sorted = true;
            for( int i =0 ; i <= k-1 ; i++  ) {
                if( arr[i] > arr[i+1]) {
                   temp = arr[i+1];
                   arr[i+1] = arr[i];
                   arr[i] = temp;
                    swaps++;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
            k--;
        }
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("Number of Swaps : "+swaps);
    }
}
