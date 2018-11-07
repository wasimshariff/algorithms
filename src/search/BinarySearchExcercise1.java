package search;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinarySearchExcercise1 {

    public static void main(String a[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Max Size");
        int maxSize = Integer.parseInt(s.nextLine());
        int arr[] = new int[maxSize];
        System.out.println("Enter Array");
        IntStream.range(0, arr.length).forEach(index -> arr[index] = Integer.parseInt(s.nextLine()));
        System.out.println("Enter number of queries");
        int query = Integer.parseInt(s.nextLine());
        int queries[] = new int[query];
        System.out.println("Enter queries");
        IntStream.range(0, queries.length).forEach(index -> queries[index] = Integer.parseInt(s.nextLine()));
        System.out.println("Printing results");
        Arrays.stream(queries).forEach(query1 -> {
           int index = findIndex(arr, query1);
            System.out.println(index);
        });
    }

    private static int findIndex(int arr[], int num) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1 ;
        while (low <= high) {
            int mid = (low + high)/2;
            if ( num < arr[mid] ) {
                high = mid - 1;
            } else if (num > arr[mid]) {
                low = mid + 1;
            }
            else {
                index = mid;
                break;
            }
        }

        return index;
    }
}
