package com.algorithms.string;

public class StringReverse {

    private String reverse(String inputString) {

        char[] chars = inputString.toCharArray();
        int head = 0, length = inputString.length(), tail = length - 1;
        while (head < tail) {
            while (head < length - 1 && isSpecialChar(chars[head])) {
                head++;
            }
            while (tail >= 1 && isSpecialChar(chars[tail])) {
                tail--;
            }
            char temp = chars[head];
            chars[head] = chars[tail];
            chars[tail] = temp;

            head++;
            tail--;
        }
        return new String(chars);
    }

    private boolean isSpecialChar(char ch) {
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            return false;
        return true;
    }

    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();
        String inputString = "abc/defgh$ij";
        inputString = "######ab";
        System.out.println(stringReverse.reverse(inputString));
    }


}
