package com.yonatan;

import java.util.Scanner;

public class ReversedString {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        System.out.print("please insert a string: ");
        String str = SCANNER.nextLine();
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        System.out.print("Reversed string is:");
        System.out.print(" " + reverse);
    }
}
