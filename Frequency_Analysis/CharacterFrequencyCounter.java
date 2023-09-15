package com.kn.array;

import java.util.Scanner;

/**
 * This program counts the frequency of characters in a given string and displays
 * the number of times each specified character appears in the string.
 */
public class CharacterFrequencyCounter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[128];
        System.out.println("Enter String ");
        String p = s.nextLine();

        char[] brr = p.toCharArray();

        System.out.println("Enter how many characters you are searching for in the string");
        int size = s.nextInt();
        char[] crr = new char[size];

        System.out.println("Enter characters to find in the string");
        for (int i = 0; i < size; i++) {
            crr[i] = s.next().charAt(0);
        }

        for (int i = 0; i < brr.length; i++) {
            int value = (int) brr[i];
            arr[value] = arr[value] + 1;
        }

        for (int i = 0; i < crr.length; i++) {
            int value = (int) crr[i];
            int as = arr[value];
            System.out.println(crr[i] + " appears in the array " + as + " times");
        }
    }
}
