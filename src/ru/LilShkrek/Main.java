package ru.LilShkrek;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hey bro, nice code!");
        //System.err.println("выводит ошибку");
        //Scanner scanner = new Scanner(System.in);
        //int firstInt = scanner.nextInt();
        //System.out.println(firstInt);
        Scanner sc = new Scanner(System.in);
        Vector arr1 = new Vector();
        Vector arr2 = new Vector();
        int sum = sc.nextInt();
        int sum2 = 0;
        int sum11 = sum;

        while(sum % 10 != 0 & sum % 9 != 0) {

            sum -= 1;
            ++sum2;

        }

        if(sum % 10 == 0) {

            while(sum != 0) {

                arr1.add(10);
                sum -= 10;

            }

            while(sum2 >= 9) {

                arr1.add(9);
                sum2 -= 9;

            }

            while(sum2 >= 5) {

                arr1.add(5);
                sum2 -= 5;

            }

            while(sum2 >= 1) {

                arr1.add(1);
                sum2 -= 1;

            }

        }else if(sum % 9 == 0) {

            while(sum != 0) {

                arr1.add(9);
                sum -= 9;

            }

            while(sum2 >= 5) {

                arr1.add(5);
                sum2 -= 5;

            }

            while(sum2 >= 1) {

                arr1.add(1);
                sum2 -= 1;

            }

        }

        while(sum11 >= 10) {

            arr2.add(10);
            sum11 -= 10;

        }

        while(sum11 >= 9) {

            arr2.add(9);
            sum11 -= 9;

        }

        while(sum11 >= 5) {

            arr2.add(5);
            sum11 -= 5;

        }

        while(sum11 >= 1) {

            arr2.add(1);
            sum11 -= 1;

        }

        if(arr1.capacity() > arr2.capacity()) {

            arr2.forEach((n) -> System.out.println(n));

        }
        else {

            arr1.forEach((n) -> System.out.println(n));

        }


        //Добавить 2 вектора, пушбэкать в них и сравнивать размеры векторов

    }
}
