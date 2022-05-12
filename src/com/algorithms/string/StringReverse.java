package com.algorithms.string;

public class StringReverse {

    private String reverse(String inputString) {

        char[] chars = inputString.toCharArray();
        int head = 0, tail = inputString.length() - 1;
        while (head < tail) {
            if (!Character.isAlphabetic(chars[head])) {
                head++;
            } else if (!Character.isAlphabetic(chars[tail])) {
                tail--;
            } else {
                char temp = chars[head];
                chars[head] = chars[tail];
                chars[tail] = temp;

                head++;
                tail--;
            }
        }
        return new String(chars);
    }


    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();
        String inputString = "abc/defgh$ij";
        inputString = "########";
        System.out.println(stringReverse.reverse(inputString));
    }


}