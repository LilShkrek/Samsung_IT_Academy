package ru.LilShkrek;

import java.util.Scanner;

public class Hometask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();

        for(int i = 0; i < n; ++i) {

            a += a;
            b += b;

            if(b >= 100) {

                ++a;
                b %= 100;

            }

        }

        System.out.println(a + " " + b);

    }

}
