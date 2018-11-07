package sort;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String a[]) {

        int arr[] = {1, 99, 5, 66, 81, 111, 14, 45, 67, 4, 13,45};
        //int arr[] = {1, 2,3,4,5};
        int k = arr.length-1;
        int temp;
        int swaps = 0;
        while ( k >= 0) {
            for( int i =0,j =1 ; i < j && j <= k ; i++,j++  ) {
                if( arr[i] > arr[j]) {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                    swaps++;
                }
            }
            k--;
        }
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("Number of Swaps : "+swaps);
    }
}
