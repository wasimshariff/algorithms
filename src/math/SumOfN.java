package math;

public class SumOfN {

    public static void main(String a[]) {
        int n = 9;
        System.out.println(sumOfN(n));

    }

    private static int sumOfN(int n) {
        if(n==1)
            return 1;
        return n + sumOfN(n-1);
    }
}
