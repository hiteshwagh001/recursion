public class recursionRevFor {
    public static void main(String[] args) {
        int n = 5;
        forwardRec(n);
        System.out.println(); // Add a line break between forward and reverse outputs
        reverseRec(n);
    }

    public static void forwardRec(int n) {
        if (n == 0) {
            return;
        }
        forwardRec(n - 1);
        System.out.print(n);
    }

    public static void reverseRec(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        reverseRec(n - 1);
    }
}
