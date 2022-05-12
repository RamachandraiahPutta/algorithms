package com.algorithms.string;

public class StringReverse {

    private String reverse(String inputString) {

        char[] chars = inputString.toCharArray();
        int head = 0, tail = inputString.length() - 1;
        while (head < tail) {
            while (isSpecialChar(chars[head])) {
                head++;
            }
            while (isSpecialChar(chars[tail])) {
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
//        inputString = "ab#c#####d";
        System.out.println(stringReverse.reverse(inputString));
    }


}
