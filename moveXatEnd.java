public class moveXatEnd {
    public static void moveXEnd(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == 'x') {
            count++;
            moveXEnd(str, idx + 1, count, newString);
        } else {
            newString += currentChar;
            moveXEnd(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axasxxfdxxfs";
        moveXEnd(str, 0, 0, "");

    }
}
