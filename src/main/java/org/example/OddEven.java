package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int number = 0;
        int countOdd = 0;
        int countEven = 0;
        Scanner in = new Scanner(System.in);
        do {
            try {
                number = in.nextInt();
                if (number!= - 1) {
                    if (number % 2 == 0) {
                        countEven += 1;
                    } else {
                        countOdd += 1;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("请输入整数！");
                in.nextLine();// 清除输入缓冲区中的无效输入
            }
        } while (number!= - 1);
        System.out.print(countOdd + " ");
        System.out.println(countEven);
    }
}