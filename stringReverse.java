public class stringReverse {
    public static void strRev(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        strRev(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "kadam";
        strRev(str, str.length() - 1);// str-length()-1 because str length is start from the 0 index

    }
}
