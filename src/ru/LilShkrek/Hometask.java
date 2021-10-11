package ru.LilShkrek;

import java.util.Scanner;

public class Hometask {

    public static void main() {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
        long suma = 0, sumb = 0;

        for(int i = 0; i < n; ++i) {

            suma += a;
            sumb += b;

            if(sumb >= 100) {

                ++suma;
                sumb -= 100;

            }

        }

        System.out.println(suma + " " + sumb);

    }

}
