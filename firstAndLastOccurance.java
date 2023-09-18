public class firstAndLastOccurance {
    public static int firstIdx = -1;
    public static int lastIdx = -1;

    public static void findOccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("first Occurance " + firstIdx);
            System.out.println("last Occurance " + lastIdx);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == element) {
            if (firstIdx == -1) {
                firstIdx = idx;
            } else {
                lastIdx = idx;
            }

        }
        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String s = "abaaacaddagh";
        findOccurance(s, 0, 'a');

    }
}