package com.alexjoiner.problems;

public class ReverseString {
    public char[] reverseString(char[] s) {
        for(int i = 0; i <= s.length / 2; i++){
            char tempLast = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = tempLast;
        }
        return s;
    }
}
