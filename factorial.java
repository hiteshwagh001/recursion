public class factorial {
    public static void main(String[] args) {
        int number=5;
        int ans=fatcNum(number);
        System.out.println(ans);
    }

    public static int fatcNum(int n) {
        if(n<=0){
            return 1;
        }
        return n * fatcNum(n-1);
    }
}
