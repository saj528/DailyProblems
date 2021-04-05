package com.alexjoiner;

import com.alexjoiner.problems.ReverseString;

public class Main {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] string = reverseString.reverseString("regrubmah".toCharArray());
        System.out.println(string);
    }
}
