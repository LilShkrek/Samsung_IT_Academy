package ru.LilShkrek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hey bro, nice code!");
        //System.err.println("выводит ошибку");
        //Scanner scanner = new Scanner(System.in);
        //int firstInt = scanner.nextInt();
        //System.out.println(firstInt);
        Scanner sc = new Scanner(System.in);
        String str1 = "";
        String str2 = "";
        int sum = sc.nextInt();
        int sum2 = 0;
        int sum11 = sum;

        while(sum % 10 != 0 & sum % 9 != 0) {

            sum -= 1;
            ++sum2;

        }

        if(sum % 10 == 0) {

            while(sum != 0) {

                str1 += "10";
                sum -= 10;

            }

            while(sum2 >= 9) {

                str1 += "9";
                sum2 -= 9;

            }

            while(sum2 >= 5) {

                str1 += "5";
                sum2 -= 5;

            }

            while(sum2 >= 1) {

                str1 += "1";
                sum2 -= 1;

            }

        }else if(sum % 9 == 0) {

            while(sum != 0) {

                str1 += "9";
                sum -= 9;

            }

            while(sum2 >= 5) {

                str1 += "5";
                sum2 -= 5;

            }

            while(sum2 >= 1) {

                str1 += "1";
                sum2 -= 1;

            }

        }

        while(sum11 >= 10) {

            str2 += "10";
            sum11 -= 10;

        }

        while(sum11 >= 9) {

            str2 += "9";
            sum11 -= 9;

        }

        while(sum11 >= 5) {

            str2 += "5";
            sum11 -= 5;

        }

        while(sum11 >= 1) {

            str2 += "1";
            sum11 -= 1;

        }

        if(str1.length() > str2.length()) System.out.println(str2);
        else System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1);

        //Добавить 2 вектора, пушбэкать в них и сравнивать размеры векторов

    }
}
