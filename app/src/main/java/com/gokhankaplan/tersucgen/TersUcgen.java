package com.gokhankaplan.tersucgen;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        // Ters üçgen

        int n;
        int i = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        n = scan.nextInt();

        while (i <= n) {
            int j=1;
            while (j <= (i - 1)) {
                j++;
                System.out.print(" ");
            }

            int k=1;

            while(k <= 2 * n - (2 * i - 1)) {
                k++;
                System.out.print("*");
            }

            i++;
            System.out.println(" ");

        }

    }
}
