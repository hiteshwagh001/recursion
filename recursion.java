// // sum of the given numbers

// public class recursion {
// public static void printSum(int i,int n, int sum){
// if(i==n){
// sum=sum+i;
// System.out.println(sum);
// return;
// }
// sum=sum+i;
// printSum(i+1, n, sum);
// System.out.println(i);
// }

// public static void main(String[] args) {
// printSum(1, 20, 0);
// }
// }
// //
// =========================================================================================
// // print factorial of the numbers
// public class recursion {
// public static int factNum(int n) {
// if(n==1 || n==0){
// return 1;
// }
// int fact_nm1 = factNum(n - 1);
// int fact = fact_nm1 * n;
// return fact;

// }

// public static void main(String[] args) {
// int factorial = factNum(5);
// System.out.println(factorial);
// }
// }
// //
// =========================================================================================

// print fibonacci series:
public class recursion{
    public static void fibonPrint(int a, int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        n--;
        fibonPrint(b, c, n);
        return ;
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;

        System.out.println(a);
        System.out.println(b);
        fibonPrint(a, b, n-2);
    }
}