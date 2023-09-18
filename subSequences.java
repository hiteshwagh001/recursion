public class subSequences {
    public static void subSequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        // to be
        subSequence(str, idx + 1, newString + currentChar);

        // not to be
        subSequence(str, idx + 1, newString);

    }

    public static void main(String[] args) {
        String sent = "abc";
        subSequence(sent, 0, "");
    }
}
