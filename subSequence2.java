import java.util.ArrayList;

public class subSequence2 {
    public static void main(String[] args) {
        String str = "abc";
        String p = "";
        subSequence(str, p);
        System.out.println(subSequenceList(str, p));
    }

    static void subSequence(String str, String p) {
        if (str.length() == 0) {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        subSequence(str.substring(1), p + ch);
        subSequence(str.substring(1), p);
    }

    static ArrayList<String> subSequenceList(String str, String p) {
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subSequenceList(str.substring(1), p + ch);
        ArrayList<String> right = subSequenceList(str.substring(1), p);
        left.addAll(right);
        return left;

    }
}