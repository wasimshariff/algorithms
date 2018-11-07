package search;

public class BinarySearch {

    public static void main(String a[]) {

        int arr[] = {1,3,5,6,8,11,14,45,67,87,99};
        int num = 67;
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

        System.out.println("found number at :" + index);;

    }

}
