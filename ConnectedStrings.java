package com.yonatan;

import java.util.Scanner;

public class ConnectedStrings {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        System.out.print("Please enter the first string: ");
        String str1 = SCANNER.nextLine();
        System.out.print("Please enter the second string: ");
        String str2 = SCANNER.nextLine();
        if (str1.contains(str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}