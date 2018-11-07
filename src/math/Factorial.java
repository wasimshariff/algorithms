package math;

public class Factorial {

    public static void main(String a[]) {
        int n = 9;
        System.out.println(factorial(n));

    }

    private static int factorial(int n) {
        if(n==1)
            return 1;
        return n * factorial(n-1);
    }
}
